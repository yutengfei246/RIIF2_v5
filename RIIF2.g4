
// §RIIF-2 version 5 adding vector and association array

grammar RIIF2;

program
    : typeDeclaration+ EOF
    ;

/*Declarations in RIIF-2 */
typeDeclaration
    : componentDeclaration
    | templateDeclaration      //RIIF-2: template
    | environmentDeclaration
    | requirementDeclaration
    ;

// §RIIF2 version 5 add imposeDeclaration  component declaration

componentDeclaration
    : COMPONENT Identifier
      (extendsList)?
      (implementsList)?  ';'
      componentBodyElement*
      END_COMPONENT
    ;

componentBodyElement
    : fieldDeclaration
    | childComponentDeclaration
    | failModeDeclaration
    | imposeDeclaration // avaible in all heracical tree
    | assignment // available only inside the component scope
    | setTemplateDeclaration // only set the predefined variable
    | assertion
    ;

fieldDeclaration
    : fieldType fieldDeclaratorType ';'
    ;

fieldDeclaratorType
    : primitiveFieldDeclarator
    | associativeIndexDeclarator
    | tableFieldDeclarator
    | listFieldDeclarator
    ;

primitiveFieldDeclarator
    : primitiveFieldDeclaratorId
      (
      ( typeType ) ? ( attributeIndex ) ?
      | associativeIndex attributeIndex
      )
      ( ':' primitiveType )
      ( ':=' fieldInitializer )?
    ;

associativeIndexDeclarator
    : associativeIndexDeclaratorId
      associativeIndex
      ( ':=' fieldInitializer )?
    ;

tableFieldDeclarator
    : tableFieldDeclaratorId ':' TYPE_TABLE
    ;

listFieldDeclarator
    : listFieldDeclaratorId ':=' listInitializer
    ;

childComponentDeclaration
    : CHILD_COMPONENT childComponentDeclarator ';'
    ;

childComponentDeclarator
    : childComponentTypeId
      childComponentDeclaratorId
      ( typeType | associativeIndex ) ?
      attributeIndex ?
    ;

failModeDeclaration
    : FAIL_MODE failModeDeclarator ';'
    ;

failModeDeclarator
    : failModeDeclaratorId
      ( typeType | associativeIndex ) ?
      attributeIndex ?
    ;

imposeDeclaration //in all hierachy
    : IMPOSE assignmentAndImposeAndSetDeclarator ';'
    ;

assignment       //only inside the scope
    : ASSIGN assignmentAndImposeAndSetDeclarator ';'
    ;

setTemplateDeclaration //set previous defined vale and valid in all herachy
    : SET assignmentAndImposeAndSetDeclarator ';'
    ;

// assignment more free, can assign everything but not type !!!
assignmentAndImposeAndSetDeclarator
    : aisDeclaratorId
      ( typeType | associativeIndex ) ?
      ( attributeIndex ) ?
      '=' aisInitializer
    ;

assertion
    : ASSERT (attributeId) ('<' | '>') expression ';'
    ;

// §RIIF-2-v5 template

templateDeclaration
    : TEMPLATE Identifier
      ( extendsList ) ? ';'
      templateBodyElement*
      END_TEMPLATE
    ;

templateBodyElement
    : abstractFieldDeclaration
    | abstractFailModeDeclaration
    | abstractPlatformDeclaration
    | imposeDeclaration // predefined value
    ;

abstractFieldDeclaration
    : ABSTRACT fieldDeclaration
    ;

abstractFailModeDeclaration
    : ABSTRACT failModeDeclaration
    ;

abstractPlatformDeclaration
    : ABSTRACT PLATFORM Identifier ';'
    ;

// §RIIF-2-v4 environment

environmentDeclaration
    : ENVIRONMENT Identifier ';'
      environmentBodyElement*
      END_ENVIRONMENT
    ;

environmentBodyElement
    : assignment
    | envParameterDeclaration
    ;

envParameterDeclaration
    : (INPUT|OUTPUT) PARAMETER variableId ':' primitiveType (':=' expression)? ';'
    ;

requirementDeclaration
    : REQUIREMENT Identifier ';'
      assertion*
      END_REQUIREMENT
    ;

fieldInitializer
    : listInitializer
    | expression
    | arrayInitializerWrapper
    ;

arrayInitializerWrapper
    : '{' arrayInitializer ( ',' arrayInitializer )*  '}'
    ;

arrayInitializer
    : '[' arrayItem ( ',' arrayItem )* ']'
    ;

arrayItem
    : expression
    ;

listInitializer
    : '{' listItem ( ',' listItem )* '}'
    ;

listItem
    : DecimalLiteral #listItemDecimalLiteral
    | FloatingPointLiteral #listItemFloatingPointLiteral
    | Identifier  #listItemIdentifier // Identifier means nothing in List expressed as String in JAVA
    ;

aisInitializer
    : listInitializer
    | expression
    | arrayInitializerWrapper
    | tableItemInitializer
    ;

tableItemInitializer
    : '{' row ( ',' row )* '}'
    ;

row
    : '[' rowItem ( ',' rowItem ) * ']' #rowArray
    | expression    #rowExpression
    ;

rowItem
    : expression #rowItemExpression
    | listInitializer #rowItemListInitializer
    ;

primitiveFieldDeclaratorId
    : Identifier
    ;

associativeIndexDeclaratorId
    : Identifier
    ;

tableFieldDeclaratorId
    : Identifier
    ;

listFieldDeclaratorId
    : Identifier
    ;

childComponentDeclaratorId
    : Identifier
    ;

childComponentTypeId
    : Identifier
    ;

failModeDeclaratorId
    : Identifier
    ;

aisDeclaratorId
    : primitiveId
    | associativeId
    | attributeId
    | tableId
    ;

primitiveId
    : Identifier
    | primitiveId ( '.' Identifier )
    ;

associativeId
    : primitiveId associativeIndex
    ;

attributeId
    : primitiveId associativeIndex? attributeIndex
    ;

// no table ID
variableId
    : primitiveId
    | associativeId
    | attributeId
    ;

attributeIndex
    : '\'' Identifier
    ;

associativeIndex
    : '[' Identifier ']'
    ;

extendsList
    : EXTENDS Identifier ( ',' Identifier )*
    ;

implementsList
    : IMPLEMENTS Identifier ( ',' Identifier )*
    ;

//  only if attribute name is Item has to be checked
tableId
    : attributeId
      '[' ('#'| Identifier) ']'
      '[' Identifier ']'
    ;

primitiveType
    : TYPE_FLOAT
    | TYPE_INTEGER
    | TYPE_STRING
    | TYPE_BOOLEAN
    | TYPE_TIME
    | Identifier
    | enumType
    ;

typeType
    : associativeType
    | vector
    ;

associativeType
    : '[' ']'
    ;

vector
    : '[' expression ':' expression ']'
    ;

fieldType
    : PARAMETER
    | CONSTANT
    ;


enumType
    : TYPE_ENUM '{' Identifier ( ',' Identifier)* '}'
    ;

/*RIIF-2: ANTlr.4 expression (Same with JAVA)*/
expression
    : primary   #expPrimary
    | op=('+'|'-') expression  #expPositiveOrNegative
    | op=('~'|'!') expression  #expWaveOrNot
    | expression op=( '*' | '/' | '%' ) expression #expStarOrDivOrMod
    | expression op=( '-' | '+' ) expression   #expMinusOrPlus
    | expression op=('<=' | '>=' | '>' | '<') expression #expCmp
    | expression op=('==' | '!=') expression #expEqOrNotEq
    | expression op='&' expression #expSingleAnd
    | expression op='^' expression #expPower
    | expression op='|' expression #expSingleOr
    | expression op='&&' expression #expDoubleAnd
    | expression op='||' expression #expDoubleOr
    | expression op='?' expression op=':' expression #expIfElse
    | <assoc=right> expression op='=' expression #expAssign
    ;

primary
    : '(' expression ')' #primaryParentheses
    | SELF  #primarySelf
    | TRUE  #primaryTrue
    | FALSE #primaryFalse
    | aisDeclaratorId   #primaryAIS
    | literal   #primaryLiteral
    | funcCall  #primaryFuncCall
    | arrayInitializer  #primaryArrayInitializer
    ;

funcCall
    : funcName '(' funcArg ( ',' funcArg ) ? ')'
    ;
funcName
    : FUNC_LOG
    | FUNC_EXP
    | FUNC_AGG_SINGLE
    | FUNC_GT_N_FAIL
    ;
funcArg
    : (aisDeclaratorId) vector
    | expression
    ;

/*Literal*/
literal
    : StringLiteral #literalString
    | DecimalLiteral #literalDecimal
    | FloatingPointLiteral #literalFloatingPoint
    ;


// Lexer

// §RIIF-2-v4 Keywords

COMPONENT: 'component';
END_COMPONENT: 'endcomponent';
ENVIRONMENT: 'environment';
END_ENVIRONMENT: 'endenvironment';
REQUIREMENT: 'requirement';
END_REQUIREMENT: 'endrequirement';
CHILD_COMPONENT: 'child_component';
FAIL_MODE: 'fail_mode';
EXTENDS: 'extends';
ASSIGN: 'assign';
ASSERT: 'assert';
INPUT: 'input';
OUTPUT: 'output';
PARAMETER: 'parameter';
CONSTANT: 'constant';
TYPE_FLOAT: 'float';
TYPE_INTEGER: 'integer';
TYPE_STRING: 'string';
TYPE_ENUM: 'enum';
TYPE_BOOLEAN: 'boolean';
TYPE_TIME: 'time';
FUNC_AGG_SINGLE: 'agg_single_fail';
FUNC_GT_N_FAIL: 'agg_gt_n_fail';
FUNC_LOG: 'LOG';
FUNC_EXP: 'EXP';
//Second part
TEMPLATE: 'template';
END_TEMPLATE: 'endtemplate';
IMPOSE: 'impose';
ABSTRACT: 'abstract';
IMPLEMENTS: 'implements';
SELF: 'self';
SET: 'set';
TYPE_TABLE: 'table';
PLATFORM: 'platform';
TRUE: 'true';
FALSE: 'false';
/*Identification */
Identifier
    : (LETTER) (LETTER|DIGIT|UNDERSCORE)*
    ;

/*Literal Tokens */
StringLiteral
    : '"' ( ~('\\' | '"') )* '"'
    ;

FloatingPointLiteral
    : DIGIT+ '.' DIGIT* Exponent? FloatTypeSuffix?
    | '.' DIGIT+ Exponent? FloatTypeSuffix?
    | DIGIT+ Exponent FloatTypeSuffix?
    ;

DecimalLiteral
    : DIGIT+
    ;

WS: (' ' | '\r' | '\t' |' \u000C' | '\n' ) ->channel(HIDDEN) ;

COMMENT
    : '/*' .*? '*/'  ->channel(HIDDEN)
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' -> channel(HIDDEN)
    ;

fragment
DIGIT: '0'..'9';
fragment
LETTER: ( 'a'..'z' | 'A'..'Z' );
fragment
UNDERSCORE: '_';
fragment
EscapeSequence
    : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    | UnicodeEscape
    | OctalEscape
    ;
fragment
OctalEscape
    : '\\' ('0'..'3')('0'..'7')('0'..'7')
    | '\\' ('0'..'7')('0'..'7')
    | '\\' ('0'..'7')
    ;
fragment
HexDigit
    : ('0'..'9' | 'a'..'f' | 'A'..'F')
    ;
fragment
UnicodeEscape
    : '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
fragment
Exponent
    : ('e'|'E')('+'|'-')?DIGIT+
    ;
fragment
FloatTypeSuffix
    : ('f'|'F'|'d'|'D')
    ;













