// Generated from /usr/Intellij/ANtlr4WorkSpace/RIIF2_v5/RIIF2.g4 by ANTLR 4.5.3
package it.polito.yutengfei.RIIF2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RIIF2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, COMPONENT=45, 
		END_COMPONENT=46, ENVIRONMENT=47, END_ENVIRONMENT=48, REQUIREMENT=49, 
		END_REQUIREMENT=50, CHILD_COMPONENT=51, FAIL_MODE=52, EXTENDS=53, ASSIGN=54, 
		ASSERT=55, INPUT=56, OUTPUT=57, PARAMETER=58, CONSTANT=59, TYPE_FLOAT=60, 
		TYPE_INTEGER=61, TYPE_STRING=62, TYPE_ENUM=63, TYPE_BOOLEAN=64, TYPE_TIME=65, 
		FUNC_AGG_SINGLE=66, FUNC_GT_N_FAIL=67, FUNC_LOG=68, FUNC_EXP=69, TEMPLATE=70, 
		END_TEMPLATE=71, IMPOSE=72, ABSTRACT=73, IMPLEMENTS=74, SELF=75, SET=76, 
		TYPE_TABLE=77, PLATFORM=78, TRUE=79, FALSE=80, Identifier=81, StringLiteral=82, 
		FloatingPointLiteral=83, DecimalLiteral=84, WS=85, COMMENT=86, LINE_COMMENT=87;
	public static final int
		RULE_program = 0, RULE_typeDeclaration = 1, RULE_componentDeclaration = 2, 
		RULE_componentBodyElement = 3, RULE_fieldDeclaration = 4, RULE_fieldDeclaratorType = 5, 
		RULE_primitiveFieldDeclarator = 6, RULE_associativeIndexDeclarator = 7, 
		RULE_tableFieldDeclarator = 8, RULE_listFieldDeclarator = 9, RULE_childComponentDeclaration = 10, 
		RULE_childComponentDeclarator = 11, RULE_failModeDeclaration = 12, RULE_failModeDeclarator = 13, 
		RULE_imposeDeclaration = 14, RULE_assignment = 15, RULE_setTemplateDeclaration = 16, 
		RULE_assignmentAndImposeAndSetDeclarator = 17, RULE_assertion = 18, RULE_templateDeclaration = 19, 
		RULE_templateBodyElement = 20, RULE_abstractFieldDeclaration = 21, RULE_abstractFailModeDeclaration = 22, 
		RULE_abstractPlatformDeclaration = 23, RULE_environmentDeclaration = 24, 
		RULE_environmentBodyElement = 25, RULE_envParameterDeclaration = 26, RULE_requirementDeclaration = 27, 
		RULE_fieldInitializer = 28, RULE_arrayInitializer = 29, RULE_arrayItem = 30, 
		RULE_listInitializer = 31, RULE_listItem = 32, RULE_aisInitializer = 33, 
		RULE_tableItemInitializer = 34, RULE_row = 35, RULE_rowItem = 36, RULE_primitiveFieldDeclaratorId = 37, 
		RULE_associativeIndexDeclaratorId = 38, RULE_tableFieldDeclaratorId = 39, 
		RULE_listFieldDeclaratorId = 40, RULE_childComponentDeclaratorId = 41, 
		RULE_childComponentTypeId = 42, RULE_failModeDeclaratorId = 43, RULE_aisDeclaratorId = 44, 
		RULE_primitiveId = 45, RULE_associativeId = 46, RULE_attributeId = 47, 
		RULE_variableId = 48, RULE_attributeIndex = 49, RULE_associativeIndex = 50, 
		RULE_extendsList = 51, RULE_implementsList = 52, RULE_tableId = 53, RULE_primitiveType = 54, 
		RULE_typeType = 55, RULE_associativeType = 56, RULE_vector = 57, RULE_fieldType = 58, 
		RULE_enumType = 59, RULE_expression = 60, RULE_primary = 61, RULE_funcCall = 62, 
		RULE_funcName = 63, RULE_funcArg = 64, RULE_literal = 65;
	public static final String[] ruleNames = {
		"program", "typeDeclaration", "componentDeclaration", "componentBodyElement", 
		"fieldDeclaration", "fieldDeclaratorType", "primitiveFieldDeclarator", 
		"associativeIndexDeclarator", "tableFieldDeclarator", "listFieldDeclarator", 
		"childComponentDeclaration", "childComponentDeclarator", "failModeDeclaration", 
		"failModeDeclarator", "imposeDeclaration", "assignment", "setTemplateDeclaration", 
		"assignmentAndImposeAndSetDeclarator", "assertion", "templateDeclaration", 
		"templateBodyElement", "abstractFieldDeclaration", "abstractFailModeDeclaration", 
		"abstractPlatformDeclaration", "environmentDeclaration", "environmentBodyElement", 
		"envParameterDeclaration", "requirementDeclaration", "fieldInitializer", 
		"arrayInitializer", "arrayItem", "listInitializer", "listItem", "aisInitializer", 
		"tableItemInitializer", "row", "rowItem", "primitiveFieldDeclaratorId", 
		"associativeIndexDeclaratorId", "tableFieldDeclaratorId", "listFieldDeclaratorId", 
		"childComponentDeclaratorId", "childComponentTypeId", "failModeDeclaratorId", 
		"aisDeclaratorId", "primitiveId", "associativeId", "attributeId", "variableId", 
		"attributeIndex", "associativeIndex", "extendsList", "implementsList", 
		"tableId", "primitiveType", "typeType", "associativeType", "vector", "fieldType", 
		"enumType", "expression", "primary", "funcCall", "funcName", "funcArg", 
		"literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "':='", "'='", "'<'", "'>'", "'['", "','", "']'", 
		"'{'", "'}'", "'.'", "'''", "'#'", "'+'", "'-'", "'~'", "'!'", "'*'", 
		"'/'", "'%'", "'<='", "'>='", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", 
		"'||'", "'?'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'>>='", "'>>>='", "'<<='", "'%='", "'('", "')'", "'component'", "'endcomponent'", 
		"'environment'", "'endenvironment'", "'requirement'", "'endrequirement'", 
		"'child_component'", "'fail_mode'", "'extends'", "'assign'", "'assert'", 
		"'input'", "'output'", "'parameter'", "'constant'", "'float'", "'integer'", 
		"'string'", "'enum'", "'boolean'", "'time'", "'agg_single_fail'", "'agg_gt_n_fail'", 
		"'LOG'", "'EXP'", "'template'", "'endtemplate'", "'impose'", "'abstract'", 
		"'implements'", "'self'", "'set'", "'table'", "'platform'", "'true'", 
		"'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "COMPONENT", "END_COMPONENT", 
		"ENVIRONMENT", "END_ENVIRONMENT", "REQUIREMENT", "END_REQUIREMENT", "CHILD_COMPONENT", 
		"FAIL_MODE", "EXTENDS", "ASSIGN", "ASSERT", "INPUT", "OUTPUT", "PARAMETER", 
		"CONSTANT", "TYPE_FLOAT", "TYPE_INTEGER", "TYPE_STRING", "TYPE_ENUM", 
		"TYPE_BOOLEAN", "TYPE_TIME", "FUNC_AGG_SINGLE", "FUNC_GT_N_FAIL", "FUNC_LOG", 
		"FUNC_EXP", "TEMPLATE", "END_TEMPLATE", "IMPOSE", "ABSTRACT", "IMPLEMENTS", 
		"SELF", "SET", "TYPE_TABLE", "PLATFORM", "TRUE", "FALSE", "Identifier", 
		"StringLiteral", "FloatingPointLiteral", "DecimalLiteral", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RIIF2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RIIF2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RIIF2Parser.EOF, 0); }
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				typeDeclaration();
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (COMPONENT - 45)) | (1L << (ENVIRONMENT - 45)) | (1L << (REQUIREMENT - 45)) | (1L << (TEMPLATE - 45)))) != 0) );
			setState(137);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public EnvironmentDeclarationContext environmentDeclaration() {
			return getRuleContext(EnvironmentDeclarationContext.class,0);
		}
		public RequirementDeclarationContext requirementDeclaration() {
			return getRuleContext(RequirementDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDeclaration);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case COMPONENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				componentDeclaration();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				templateDeclaration();
				}
				break;
			case ENVIRONMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				environmentDeclaration();
				}
				break;
			case REQUIREMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				requirementDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(RIIF2Parser.COMPONENT, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public TerminalNode END_COMPONENT() { return getToken(RIIF2Parser.END_COMPONENT, 0); }
		public ExtendsListContext extendsList() {
			return getRuleContext(ExtendsListContext.class,0);
		}
		public ImplementsListContext implementsList() {
			return getRuleContext(ImplementsListContext.class,0);
		}
		public List<ComponentBodyElementContext> componentBodyElement() {
			return getRuleContexts(ComponentBodyElementContext.class);
		}
		public ComponentBodyElementContext componentBodyElement(int i) {
			return getRuleContext(ComponentBodyElementContext.class,i);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitComponentDeclaration(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(COMPONENT);
			setState(146);
			match(Identifier);
			setState(148);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(147);
				extendsList();
				}
			}

			setState(151);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(150);
				implementsList();
				}
			}

			setState(153);
			match(T__0);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (CHILD_COMPONENT - 51)) | (1L << (FAIL_MODE - 51)) | (1L << (ASSIGN - 51)) | (1L << (ASSERT - 51)) | (1L << (PARAMETER - 51)) | (1L << (CONSTANT - 51)) | (1L << (IMPOSE - 51)) | (1L << (SET - 51)))) != 0)) {
				{
				{
				setState(154);
				componentBodyElement();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(END_COMPONENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentBodyElementContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ChildComponentDeclarationContext childComponentDeclaration() {
			return getRuleContext(ChildComponentDeclarationContext.class,0);
		}
		public FailModeDeclarationContext failModeDeclaration() {
			return getRuleContext(FailModeDeclarationContext.class,0);
		}
		public ImposeDeclarationContext imposeDeclaration() {
			return getRuleContext(ImposeDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SetTemplateDeclarationContext setTemplateDeclaration() {
			return getRuleContext(SetTemplateDeclarationContext.class,0);
		}
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public ComponentBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterComponentBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitComponentBodyElement(this);
		}
	}

	public final ComponentBodyElementContext componentBodyElement() throws RecognitionException {
		ComponentBodyElementContext _localctx = new ComponentBodyElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_componentBodyElement);
		try {
			setState(169);
			switch (_input.LA(1)) {
			case PARAMETER:
			case CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				fieldDeclaration();
				}
				break;
			case CHILD_COMPONENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				childComponentDeclaration();
				}
				break;
			case FAIL_MODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				failModeDeclaration();
				}
				break;
			case IMPOSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				imposeDeclaration();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				assignment();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				setTemplateDeclaration();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				assertion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public FieldDeclaratorTypeContext fieldDeclaratorType() {
			return getRuleContext(FieldDeclaratorTypeContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			fieldType();
			setState(172);
			fieldDeclaratorType();
			setState(173);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclaratorTypeContext extends ParserRuleContext {
		public PrimitiveFieldDeclaratorContext primitiveFieldDeclarator() {
			return getRuleContext(PrimitiveFieldDeclaratorContext.class,0);
		}
		public AssociativeIndexDeclaratorContext associativeIndexDeclarator() {
			return getRuleContext(AssociativeIndexDeclaratorContext.class,0);
		}
		public TableFieldDeclaratorContext tableFieldDeclarator() {
			return getRuleContext(TableFieldDeclaratorContext.class,0);
		}
		public ListFieldDeclaratorContext listFieldDeclarator() {
			return getRuleContext(ListFieldDeclaratorContext.class,0);
		}
		public FieldDeclaratorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaratorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFieldDeclaratorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFieldDeclaratorType(this);
		}
	}

	public final FieldDeclaratorTypeContext fieldDeclaratorType() throws RecognitionException {
		FieldDeclaratorTypeContext _localctx = new FieldDeclaratorTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldDeclaratorType);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				primitiveFieldDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				associativeIndexDeclarator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				tableFieldDeclarator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				listFieldDeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveFieldDeclaratorContext extends ParserRuleContext {
		public PrimitiveFieldDeclaratorIdContext primitiveFieldDeclaratorId() {
			return getRuleContext(PrimitiveFieldDeclaratorIdContext.class,0);
		}
		public AssociativeIndexContext associativeIndex() {
			return getRuleContext(AssociativeIndexContext.class,0);
		}
		public AttributeIndexContext attributeIndex() {
			return getRuleContext(AttributeIndexContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public FieldInitializerContext fieldInitializer() {
			return getRuleContext(FieldInitializerContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public PrimitiveFieldDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveFieldDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterPrimitiveFieldDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitPrimitiveFieldDeclarator(this);
		}
	}

	public final PrimitiveFieldDeclaratorContext primitiveFieldDeclarator() throws RecognitionException {
		PrimitiveFieldDeclaratorContext _localctx = new PrimitiveFieldDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primitiveFieldDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			primitiveFieldDeclaratorId();
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(183);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(182);
					typeType();
					}
				}

				setState(186);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(185);
					attributeIndex();
					}
				}

				}
				break;
			case 2:
				{
				setState(188);
				associativeIndex();
				setState(189);
				attributeIndex();
				}
				break;
			}
			{
			setState(193);
			match(T__1);
			setState(194);
			primitiveType();
			}
			setState(198);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(196);
				match(T__2);
				setState(197);
				fieldInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativeIndexDeclaratorContext extends ParserRuleContext {
		public AssociativeIndexDeclaratorIdContext associativeIndexDeclaratorId() {
			return getRuleContext(AssociativeIndexDeclaratorIdContext.class,0);
		}
		public AssociativeIndexContext associativeIndex() {
			return getRuleContext(AssociativeIndexContext.class,0);
		}
		public FieldInitializerContext fieldInitializer() {
			return getRuleContext(FieldInitializerContext.class,0);
		}
		public AssociativeIndexDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeIndexDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssociativeIndexDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssociativeIndexDeclarator(this);
		}
	}

	public final AssociativeIndexDeclaratorContext associativeIndexDeclarator() throws RecognitionException {
		AssociativeIndexDeclaratorContext _localctx = new AssociativeIndexDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_associativeIndexDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			associativeIndexDeclaratorId();
			setState(201);
			associativeIndex();
			setState(204);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(202);
				match(T__2);
				setState(203);
				fieldInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableFieldDeclaratorContext extends ParserRuleContext {
		public TableFieldDeclaratorIdContext tableFieldDeclaratorId() {
			return getRuleContext(TableFieldDeclaratorIdContext.class,0);
		}
		public TerminalNode TYPE_TABLE() { return getToken(RIIF2Parser.TYPE_TABLE, 0); }
		public TableFieldDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFieldDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTableFieldDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTableFieldDeclarator(this);
		}
	}

	public final TableFieldDeclaratorContext tableFieldDeclarator() throws RecognitionException {
		TableFieldDeclaratorContext _localctx = new TableFieldDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableFieldDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			tableFieldDeclaratorId();
			setState(207);
			match(T__1);
			setState(208);
			match(TYPE_TABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListFieldDeclaratorContext extends ParserRuleContext {
		public ListFieldDeclaratorIdContext listFieldDeclaratorId() {
			return getRuleContext(ListFieldDeclaratorIdContext.class,0);
		}
		public ListInitializerContext listInitializer() {
			return getRuleContext(ListInitializerContext.class,0);
		}
		public ListFieldDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listFieldDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterListFieldDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitListFieldDeclarator(this);
		}
	}

	public final ListFieldDeclaratorContext listFieldDeclarator() throws RecognitionException {
		ListFieldDeclaratorContext _localctx = new ListFieldDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listFieldDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			listFieldDeclaratorId();
			setState(211);
			match(T__2);
			setState(212);
			listInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode CHILD_COMPONENT() { return getToken(RIIF2Parser.CHILD_COMPONENT, 0); }
		public ChildComponentDeclaratorContext childComponentDeclarator() {
			return getRuleContext(ChildComponentDeclaratorContext.class,0);
		}
		public ChildComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childComponentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterChildComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitChildComponentDeclaration(this);
		}
	}

	public final ChildComponentDeclarationContext childComponentDeclaration() throws RecognitionException {
		ChildComponentDeclarationContext _localctx = new ChildComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_childComponentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(CHILD_COMPONENT);
			setState(215);
			childComponentDeclarator();
			setState(216);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildComponentDeclaratorContext extends ParserRuleContext {
		public ChildComponentTypeIdContext childComponentTypeId() {
			return getRuleContext(ChildComponentTypeIdContext.class,0);
		}
		public ChildComponentDeclaratorIdContext childComponentDeclaratorId() {
			return getRuleContext(ChildComponentDeclaratorIdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AssociativeIndexContext associativeIndex() {
			return getRuleContext(AssociativeIndexContext.class,0);
		}
		public AttributeIndexContext attributeIndex() {
			return getRuleContext(AttributeIndexContext.class,0);
		}
		public ChildComponentDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childComponentDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterChildComponentDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitChildComponentDeclarator(this);
		}
	}

	public final ChildComponentDeclaratorContext childComponentDeclarator() throws RecognitionException {
		ChildComponentDeclaratorContext _localctx = new ChildComponentDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_childComponentDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			childComponentTypeId();
			setState(219);
			childComponentDeclaratorId();
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(220);
				typeType();
				}
				break;
			case 2:
				{
				setState(221);
				associativeIndex();
				}
				break;
			}
			setState(225);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(224);
				attributeIndex();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FailModeDeclarationContext extends ParserRuleContext {
		public TerminalNode FAIL_MODE() { return getToken(RIIF2Parser.FAIL_MODE, 0); }
		public FailModeDeclaratorContext failModeDeclarator() {
			return getRuleContext(FailModeDeclaratorContext.class,0);
		}
		public FailModeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failModeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFailModeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFailModeDeclaration(this);
		}
	}

	public final FailModeDeclarationContext failModeDeclaration() throws RecognitionException {
		FailModeDeclarationContext _localctx = new FailModeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_failModeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(FAIL_MODE);
			setState(228);
			failModeDeclarator();
			setState(229);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FailModeDeclaratorContext extends ParserRuleContext {
		public FailModeDeclaratorIdContext failModeDeclaratorId() {
			return getRuleContext(FailModeDeclaratorIdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AssociativeIndexContext associativeIndex() {
			return getRuleContext(AssociativeIndexContext.class,0);
		}
		public AttributeIndexContext attributeIndex() {
			return getRuleContext(AttributeIndexContext.class,0);
		}
		public FailModeDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failModeDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFailModeDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFailModeDeclarator(this);
		}
	}

	public final FailModeDeclaratorContext failModeDeclarator() throws RecognitionException {
		FailModeDeclaratorContext _localctx = new FailModeDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_failModeDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			failModeDeclaratorId();
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(232);
				typeType();
				}
				break;
			case 2:
				{
				setState(233);
				associativeIndex();
				}
				break;
			}
			setState(237);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(236);
				attributeIndex();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImposeDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPOSE() { return getToken(RIIF2Parser.IMPOSE, 0); }
		public AssignmentAndImposeAndSetDeclaratorContext assignmentAndImposeAndSetDeclarator() {
			return getRuleContext(AssignmentAndImposeAndSetDeclaratorContext.class,0);
		}
		public ImposeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imposeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterImposeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitImposeDeclaration(this);
		}
	}

	public final ImposeDeclarationContext imposeDeclaration() throws RecognitionException {
		ImposeDeclarationContext _localctx = new ImposeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_imposeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(IMPOSE);
			setState(240);
			assignmentAndImposeAndSetDeclarator();
			setState(241);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(RIIF2Parser.ASSIGN, 0); }
		public AssignmentAndImposeAndSetDeclaratorContext assignmentAndImposeAndSetDeclarator() {
			return getRuleContext(AssignmentAndImposeAndSetDeclaratorContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(ASSIGN);
			setState(244);
			assignmentAndImposeAndSetDeclarator();
			setState(245);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTemplateDeclarationContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(RIIF2Parser.SET, 0); }
		public AssignmentAndImposeAndSetDeclaratorContext assignmentAndImposeAndSetDeclarator() {
			return getRuleContext(AssignmentAndImposeAndSetDeclaratorContext.class,0);
		}
		public SetTemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTemplateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterSetTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitSetTemplateDeclaration(this);
		}
	}

	public final SetTemplateDeclarationContext setTemplateDeclaration() throws RecognitionException {
		SetTemplateDeclarationContext _localctx = new SetTemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_setTemplateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(SET);
			setState(248);
			assignmentAndImposeAndSetDeclarator();
			setState(249);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentAndImposeAndSetDeclaratorContext extends ParserRuleContext {
		public AisDeclaratorIdContext aisDeclaratorId() {
			return getRuleContext(AisDeclaratorIdContext.class,0);
		}
		public AisInitializerContext aisInitializer() {
			return getRuleContext(AisInitializerContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AssociativeIndexContext associativeIndex() {
			return getRuleContext(AssociativeIndexContext.class,0);
		}
		public AttributeIndexContext attributeIndex() {
			return getRuleContext(AttributeIndexContext.class,0);
		}
		public AssignmentAndImposeAndSetDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentAndImposeAndSetDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignmentAndImposeAndSetDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignmentAndImposeAndSetDeclarator(this);
		}
	}

	public final AssignmentAndImposeAndSetDeclaratorContext assignmentAndImposeAndSetDeclarator() throws RecognitionException {
		AssignmentAndImposeAndSetDeclaratorContext _localctx = new AssignmentAndImposeAndSetDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignmentAndImposeAndSetDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			aisDeclaratorId();
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(252);
				typeType();
				}
				break;
			case 2:
				{
				setState(253);
				associativeIndex();
				}
				break;
			}
			setState(257);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(256);
				attributeIndex();
				}
			}

			setState(259);
			match(T__3);
			setState(260);
			aisInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertionContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(RIIF2Parser.ASSERT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributeIdContext attributeId() {
			return getRuleContext(AttributeIdContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assertion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ASSERT);
			{
			setState(263);
			attributeId();
			}
			setState(264);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(265);
			expression(0);
			setState(266);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateDeclarationContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(RIIF2Parser.TEMPLATE, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public TerminalNode END_TEMPLATE() { return getToken(RIIF2Parser.END_TEMPLATE, 0); }
		public ExtendsListContext extendsList() {
			return getRuleContext(ExtendsListContext.class,0);
		}
		public List<TemplateBodyElementContext> templateBodyElement() {
			return getRuleContexts(TemplateBodyElementContext.class);
		}
		public TemplateBodyElementContext templateBodyElement(int i) {
			return getRuleContext(TemplateBodyElementContext.class,i);
		}
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTemplateDeclaration(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_templateDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(TEMPLATE);
			setState(269);
			match(Identifier);
			setState(271);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(270);
				extendsList();
				}
			}

			setState(273);
			match(T__0);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPOSE || _la==ABSTRACT) {
				{
				{
				setState(274);
				templateBodyElement();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(END_TEMPLATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateBodyElementContext extends ParserRuleContext {
		public AbstractFieldDeclarationContext abstractFieldDeclaration() {
			return getRuleContext(AbstractFieldDeclarationContext.class,0);
		}
		public AbstractFailModeDeclarationContext abstractFailModeDeclaration() {
			return getRuleContext(AbstractFailModeDeclarationContext.class,0);
		}
		public AbstractPlatformDeclarationContext abstractPlatformDeclaration() {
			return getRuleContext(AbstractPlatformDeclarationContext.class,0);
		}
		public ImposeDeclarationContext imposeDeclaration() {
			return getRuleContext(ImposeDeclarationContext.class,0);
		}
		public TemplateBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTemplateBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTemplateBodyElement(this);
		}
	}

	public final TemplateBodyElementContext templateBodyElement() throws RecognitionException {
		TemplateBodyElementContext _localctx = new TemplateBodyElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_templateBodyElement);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				abstractFieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				abstractFailModeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				abstractPlatformDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				imposeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractFieldDeclarationContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public AbstractFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractFieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractFieldDeclaration(this);
		}
	}

	public final AbstractFieldDeclarationContext abstractFieldDeclaration() throws RecognitionException {
		AbstractFieldDeclarationContext _localctx = new AbstractFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_abstractFieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(ABSTRACT);
			setState(289);
			fieldDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractFailModeDeclarationContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public FailModeDeclarationContext failModeDeclaration() {
			return getRuleContext(FailModeDeclarationContext.class,0);
		}
		public AbstractFailModeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractFailModeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractFailModeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractFailModeDeclaration(this);
		}
	}

	public final AbstractFailModeDeclarationContext abstractFailModeDeclaration() throws RecognitionException {
		AbstractFailModeDeclarationContext _localctx = new AbstractFailModeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_abstractFailModeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(ABSTRACT);
			setState(292);
			failModeDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractPlatformDeclarationContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode PLATFORM() { return getToken(RIIF2Parser.PLATFORM, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public AbstractPlatformDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractPlatformDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractPlatformDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractPlatformDeclaration(this);
		}
	}

	public final AbstractPlatformDeclarationContext abstractPlatformDeclaration() throws RecognitionException {
		AbstractPlatformDeclarationContext _localctx = new AbstractPlatformDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_abstractPlatformDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ABSTRACT);
			setState(295);
			match(PLATFORM);
			setState(296);
			match(Identifier);
			setState(297);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironmentDeclarationContext extends ParserRuleContext {
		public TerminalNode ENVIRONMENT() { return getToken(RIIF2Parser.ENVIRONMENT, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public TerminalNode END_ENVIRONMENT() { return getToken(RIIF2Parser.END_ENVIRONMENT, 0); }
		public List<EnvironmentBodyElementContext> environmentBodyElement() {
			return getRuleContexts(EnvironmentBodyElementContext.class);
		}
		public EnvironmentBodyElementContext environmentBodyElement(int i) {
			return getRuleContext(EnvironmentBodyElementContext.class,i);
		}
		public EnvironmentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environmentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnvironmentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnvironmentDeclaration(this);
		}
	}

	public final EnvironmentDeclarationContext environmentDeclaration() throws RecognitionException {
		EnvironmentDeclarationContext _localctx = new EnvironmentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_environmentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(ENVIRONMENT);
			setState(300);
			match(Identifier);
			setState(301);
			match(T__0);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << INPUT) | (1L << OUTPUT))) != 0)) {
				{
				{
				setState(302);
				environmentBodyElement();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(END_ENVIRONMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironmentBodyElementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public EnvParameterDeclarationContext envParameterDeclaration() {
			return getRuleContext(EnvParameterDeclarationContext.class,0);
		}
		public EnvironmentBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environmentBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnvironmentBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnvironmentBodyElement(this);
		}
	}

	public final EnvironmentBodyElementContext environmentBodyElement() throws RecognitionException {
		EnvironmentBodyElementContext _localctx = new EnvironmentBodyElementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_environmentBodyElement);
		try {
			setState(312);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				assignment();
				}
				break;
			case INPUT:
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				envParameterDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvParameterDeclarationContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(RIIF2Parser.PARAMETER, 0); }
		public VariableIdContext variableId() {
			return getRuleContext(VariableIdContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode INPUT() { return getToken(RIIF2Parser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(RIIF2Parser.OUTPUT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnvParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_envParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnvParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnvParameterDeclaration(this);
		}
	}

	public final EnvParameterDeclarationContext envParameterDeclaration() throws RecognitionException {
		EnvParameterDeclarationContext _localctx = new EnvParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_envParameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==INPUT || _la==OUTPUT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(315);
			match(PARAMETER);
			setState(316);
			variableId();
			setState(317);
			match(T__1);
			setState(318);
			primitiveType();
			setState(321);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(319);
				match(T__2);
				setState(320);
				expression(0);
				}
			}

			setState(323);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementDeclarationContext extends ParserRuleContext {
		public TerminalNode REQUIREMENT() { return getToken(RIIF2Parser.REQUIREMENT, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public TerminalNode END_REQUIREMENT() { return getToken(RIIF2Parser.END_REQUIREMENT, 0); }
		public List<AssertionContext> assertion() {
			return getRuleContexts(AssertionContext.class);
		}
		public AssertionContext assertion(int i) {
			return getRuleContext(AssertionContext.class,i);
		}
		public RequirementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterRequirementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitRequirementDeclaration(this);
		}
	}

	public final RequirementDeclarationContext requirementDeclaration() throws RecognitionException {
		RequirementDeclarationContext _localctx = new RequirementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_requirementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(REQUIREMENT);
			setState(326);
			match(Identifier);
			setState(327);
			match(T__0);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSERT) {
				{
				{
				setState(328);
				assertion();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(END_REQUIREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldInitializerContext extends ParserRuleContext {
		public ListInitializerContext listInitializer() {
			return getRuleContext(ListInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public FieldInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFieldInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFieldInitializer(this);
		}
	}

	public final FieldInitializerContext fieldInitializer() throws RecognitionException {
		FieldInitializerContext _localctx = new FieldInitializerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fieldInitializer);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				listInitializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<ArrayItemContext> arrayItem() {
			return getRuleContexts(ArrayItemContext.class);
		}
		public ArrayItemContext arrayItem(int i) {
			return getRuleContext(ArrayItemContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__6);
			setState(342);
			arrayItem();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(343);
				match(T__7);
				setState(344);
				arrayItem();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(RIIF2Parser.StringLiteral, 0); }
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterArrayItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitArrayItem(this);
		}
	}

	public final ArrayItemContext arrayItem() throws RecognitionException {
		ArrayItemContext _localctx = new ArrayItemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayItem);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListInitializerContext extends ParserRuleContext {
		public List<ListItemContext> listItem() {
			return getRuleContexts(ListItemContext.class);
		}
		public ListItemContext listItem(int i) {
			return getRuleContext(ListItemContext.class,i);
		}
		public ListInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterListInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitListInitializer(this);
		}
	}

	public final ListInitializerContext listInitializer() throws RecognitionException {
		ListInitializerContext _localctx = new ListInitializerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_listInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__9);
			setState(358);
			listItem();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(359);
				match(T__7);
				setState(360);
				listItem();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListItemContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(RIIF2Parser.DecimalLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(RIIF2Parser.FloatingPointLiteral, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public ListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitListItem(this);
		}
	}

	public final ListItemContext listItem() throws RecognitionException {
		ListItemContext _localctx = new ListItemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (FloatingPointLiteral - 81)) | (1L << (DecimalLiteral - 81)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AisInitializerContext extends ParserRuleContext {
		public FieldInitializerContext fieldInitializer() {
			return getRuleContext(FieldInitializerContext.class,0);
		}
		public TableItemInitializerContext tableItemInitializer() {
			return getRuleContext(TableItemInitializerContext.class,0);
		}
		public AisInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aisInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAisInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAisInitializer(this);
		}
	}

	public final AisInitializerContext aisInitializer() throws RecognitionException {
		AisInitializerContext _localctx = new AisInitializerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_aisInitializer);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				fieldInitializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				tableItemInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableItemInitializerContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public TableItemInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableItemInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTableItemInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTableItemInitializer(this);
		}
	}

	public final TableItemInitializerContext tableItemInitializer() throws RecognitionException {
		TableItemInitializerContext _localctx = new TableItemInitializerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tableItemInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__9);
			setState(375);
			row();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(376);
				match(T__7);
				setState(377);
				row();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public List<RowItemContext> rowItem() {
			return getRuleContexts(RowItemContext.class);
		}
		public RowItemContext rowItem(int i) {
			return getRuleContext(RowItemContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_row);
		int _la;
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(T__6);
				setState(386);
				rowItem();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(387);
					match(T__7);
					setState(388);
					rowItem();
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(394);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListInitializerContext listInitializer() {
			return getRuleContext(ListInitializerContext.class,0);
		}
		public RowItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterRowItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitRowItem(this);
		}
	}

	public final RowItemContext rowItem() throws RecognitionException {
		RowItemContext _localctx = new RowItemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_rowItem);
		try {
			setState(401);
			switch (_input.LA(1)) {
			case T__6:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__42:
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
			case SELF:
			case TRUE:
			case FALSE:
			case Identifier:
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				expression(0);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				listInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveFieldDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public PrimitiveFieldDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveFieldDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterPrimitiveFieldDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitPrimitiveFieldDeclaratorId(this);
		}
	}

	public final PrimitiveFieldDeclaratorIdContext primitiveFieldDeclaratorId() throws RecognitionException {
		PrimitiveFieldDeclaratorIdContext _localctx = new PrimitiveFieldDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_primitiveFieldDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativeIndexDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public AssociativeIndexDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeIndexDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssociativeIndexDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssociativeIndexDeclaratorId(this);
		}
	}

	public final AssociativeIndexDeclaratorIdContext associativeIndexDeclaratorId() throws RecognitionException {
		AssociativeIndexDeclaratorIdContext _localctx = new AssociativeIndexDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_associativeIndexDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableFieldDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public TableFieldDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFieldDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTableFieldDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTableFieldDeclaratorId(this);
		}
	}

	public final TableFieldDeclaratorIdContext tableFieldDeclaratorId() throws RecognitionException {
		TableFieldDeclaratorIdContext _localctx = new TableFieldDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tableFieldDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListFieldDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public ListFieldDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listFieldDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterListFieldDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitListFieldDeclaratorId(this);
		}
	}

	public final ListFieldDeclaratorIdContext listFieldDeclaratorId() throws RecognitionException {
		ListFieldDeclaratorIdContext _localctx = new ListFieldDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_listFieldDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildComponentDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public ChildComponentDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childComponentDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterChildComponentDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitChildComponentDeclaratorId(this);
		}
	}

	public final ChildComponentDeclaratorIdContext childComponentDeclaratorId() throws RecognitionException {
		ChildComponentDeclaratorIdContext _localctx = new ChildComponentDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_childComponentDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildComponentTypeIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public ChildComponentTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childComponentTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterChildComponentTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitChildComponentTypeId(this);
		}
	}

	public final ChildComponentTypeIdContext childComponentTypeId() throws RecognitionException {
		ChildComponentTypeIdContext _localctx = new ChildComponentTypeIdContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_childComponentTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FailModeDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public FailModeDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failModeDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFailModeDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFailModeDeclaratorId(this);
		}
	}

	public final FailModeDeclaratorIdContext failModeDeclaratorId() throws RecognitionException {
		FailModeDeclaratorIdContext _localctx = new FailModeDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_failModeDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AisDeclaratorIdContext extends ParserRuleContext {
		public PrimitiveIdContext primitiveId() {
			return getRuleContext(PrimitiveIdContext.class,0);
		}
		public AssociativeIdContext associativeId() {
			return getRuleContext(AssociativeIdContext.class,0);
		}
		public AttributeIdContext attributeId() {
			return getRuleContext(AttributeIdContext.class,0);
		}
		public TableIdContext tableId() {
			return getRuleContext(TableIdContext.class,0);
		}
		public AisDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aisDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAisDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAisDeclaratorId(this);
		}
	}

	public final AisDeclaratorIdContext aisDeclaratorId() throws RecognitionException {
		AisDeclaratorIdContext _localctx = new AisDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_aisDeclaratorId);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				primitiveId(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				associativeId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				attributeId();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				tableId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public PrimitiveIdContext primitiveId() {
			return getRuleContext(PrimitiveIdContext.class,0);
		}
		public PrimitiveIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterPrimitiveId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitPrimitiveId(this);
		}
	}

	public final PrimitiveIdContext primitiveId() throws RecognitionException {
		return primitiveId(0);
	}

	private PrimitiveIdContext primitiveId(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimitiveIdContext _localctx = new PrimitiveIdContext(_ctx, _parentState);
		PrimitiveIdContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_primitiveId, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(424);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimitiveIdContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primitiveId);
					setState(426);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(427);
					match(T__11);
					setState(428);
					match(Identifier);
					}
					}
					} 
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssociativeIdContext extends ParserRuleContext {
		public PrimitiveIdContext primitiveId() {
			return getRuleContext(PrimitiveIdContext.class,0);
		}
		public AssociativeIndexContext associativeIndex() {
			return getRuleContext(AssociativeIndexContext.class,0);
		}
		public AssociativeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssociativeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssociativeId(this);
		}
	}

	public final AssociativeIdContext associativeId() throws RecognitionException {
		AssociativeIdContext _localctx = new AssociativeIdContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_associativeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			primitiveId(0);
			setState(435);
			associativeIndex();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeIdContext extends ParserRuleContext {
		public PrimitiveIdContext primitiveId() {
			return getRuleContext(PrimitiveIdContext.class,0);
		}
		public AttributeIndexContext attributeIndex() {
			return getRuleContext(AttributeIndexContext.class,0);
		}
		public AssociativeIndexContext associativeIndex() {
			return getRuleContext(AssociativeIndexContext.class,0);
		}
		public AttributeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAttributeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAttributeId(this);
		}
	}

	public final AttributeIdContext attributeId() throws RecognitionException {
		AttributeIdContext _localctx = new AttributeIdContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_attributeId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			primitiveId(0);
			setState(439);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(438);
				associativeIndex();
				}
			}

			setState(441);
			attributeIndex();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableIdContext extends ParserRuleContext {
		public PrimitiveIdContext primitiveId() {
			return getRuleContext(PrimitiveIdContext.class,0);
		}
		public AssociativeIdContext associativeId() {
			return getRuleContext(AssociativeIdContext.class,0);
		}
		public AttributeIdContext attributeId() {
			return getRuleContext(AttributeIdContext.class,0);
		}
		public VariableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVariableId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVariableId(this);
		}
	}

	public final VariableIdContext variableId() throws RecognitionException {
		VariableIdContext _localctx = new VariableIdContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variableId);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				primitiveId(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				associativeId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				attributeId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeIndexContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public AttributeIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAttributeIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAttributeIndex(this);
		}
	}

	public final AttributeIndexContext attributeIndex() throws RecognitionException {
		AttributeIndexContext _localctx = new AttributeIndexContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_attributeIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__12);
			setState(449);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativeIndexContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public AssociativeIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssociativeIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssociativeIndex(this);
		}
	}

	public final AssociativeIndexContext associativeIndex() throws RecognitionException {
		AssociativeIndexContext _localctx = new AssociativeIndexContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_associativeIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__6);
			setState(452);
			match(Identifier);
			setState(453);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsListContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(RIIF2Parser.EXTENDS, 0); }
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public ExtendsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterExtendsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitExtendsList(this);
		}
	}

	public final ExtendsListContext extendsList() throws RecognitionException {
		ExtendsListContext _localctx = new ExtendsListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_extendsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(EXTENDS);
			setState(456);
			match(Identifier);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(457);
				match(T__7);
				setState(458);
				match(Identifier);
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsListContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(RIIF2Parser.IMPLEMENTS, 0); }
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public ImplementsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterImplementsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitImplementsList(this);
		}
	}

	public final ImplementsListContext implementsList() throws RecognitionException {
		ImplementsListContext _localctx = new ImplementsListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_implementsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(IMPLEMENTS);
			setState(465);
			match(Identifier);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(466);
				match(T__7);
				setState(467);
				match(Identifier);
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdContext extends ParserRuleContext {
		public AttributeIdContext attributeId() {
			return getRuleContext(AttributeIdContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public TableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTableId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTableId(this);
		}
	}

	public final TableIdContext tableId() throws RecognitionException {
		TableIdContext _localctx = new TableIdContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tableId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			attributeId();
			setState(474);
			match(T__6);
			setState(475);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(476);
			match(T__8);
			setState(477);
			match(T__6);
			setState(478);
			match(Identifier);
			setState(479);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_FLOAT() { return getToken(RIIF2Parser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_INTEGER() { return getToken(RIIF2Parser.TYPE_INTEGER, 0); }
		public TerminalNode TYPE_STRING() { return getToken(RIIF2Parser.TYPE_STRING, 0); }
		public TerminalNode TYPE_BOOLEAN() { return getToken(RIIF2Parser.TYPE_BOOLEAN, 0); }
		public TerminalNode TYPE_TIME() { return getToken(RIIF2Parser.TYPE_TIME, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_primitiveType);
		try {
			setState(488);
			switch (_input.LA(1)) {
			case TYPE_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(TYPE_FLOAT);
				}
				break;
			case TYPE_INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(TYPE_INTEGER);
				}
				break;
			case TYPE_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				match(TYPE_STRING);
				}
				break;
			case TYPE_BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				match(TYPE_BOOLEAN);
				}
				break;
			case TYPE_TIME:
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				match(TYPE_TIME);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(486);
				match(Identifier);
				}
				break;
			case TYPE_ENUM:
				enterOuterAlt(_localctx, 7);
				{
				setState(487);
				enumType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public AssociativeTypeContext associativeType() {
			return getRuleContext(AssociativeTypeContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeType);
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				associativeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				vector();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativeTypeContext extends ParserRuleContext {
		public AssociativeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssociativeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssociativeType(this);
		}
	}

	public final AssociativeTypeContext associativeType() throws RecognitionException {
		AssociativeTypeContext _localctx = new AssociativeTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_associativeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(T__6);
			setState(495);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVector(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(T__6);
			setState(498);
			expression(0);
			setState(499);
			match(T__1);
			setState(500);
			expression(0);
			setState(501);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldTypeContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(RIIF2Parser.PARAMETER, 0); }
		public TerminalNode CONSTANT() { return getToken(RIIF2Parser.CONSTANT, 0); }
		public FieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFieldType(this);
		}
	}

	public final FieldTypeContext fieldType() throws RecognitionException {
		FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fieldType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_la = _input.LA(1);
			if ( !(_la==PARAMETER || _la==CONSTANT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_ENUM() { return getToken(RIIF2Parser.TYPE_ENUM, 0); }
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnumType(this);
		}
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_enumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(TYPE_ENUM);
			setState(506);
			match(T__9);
			setState(507);
			match(Identifier);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(508);
				match(T__7);
				setState(509);
				match(Identifier);
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			switch (_input.LA(1)) {
			case T__6:
			case T__42:
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
			case SELF:
			case TRUE:
			case FALSE:
			case Identifier:
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
				{
				setState(518);
				primary();
				}
				break;
			case T__14:
			case T__15:
				{
				setState(519);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(520);
				expression(14);
				}
				break;
			case T__16:
			case T__17:
				{
				setState(521);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(522);
				expression(13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(572);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(525);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(526);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(527);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(528);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(529);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(530);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(531);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(539);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
						case 1:
							{
							setState(532);
							match(T__4);
							setState(533);
							match(T__4);
							}
							break;
						case 2:
							{
							setState(534);
							match(T__5);
							setState(535);
							match(T__5);
							setState(536);
							match(T__5);
							}
							break;
						case 3:
							{
							setState(537);
							match(T__5);
							setState(538);
							match(T__5);
							}
							break;
						}
						setState(541);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(542);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(543);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__21) | (1L << T__22))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(544);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(545);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(546);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(547);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(548);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(549);
						match(T__25);
						setState(550);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(551);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(552);
						match(T__26);
						setState(553);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(554);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(555);
						match(T__27);
						setState(556);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(557);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(558);
						match(T__28);
						setState(559);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(560);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(561);
						match(T__29);
						setState(562);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(563);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(564);
						match(T__30);
						setState(565);
						expression(0);
						setState(566);
						match(T__1);
						setState(567);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(569);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(570);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(571);
						expression(1);
						}
						break;
					}
					} 
				}
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELF() { return getToken(RIIF2Parser.SELF, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public TerminalNode TRUE() { return getToken(RIIF2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RIIF2Parser.FALSE, 0); }
		public AisDeclaratorIdContext aisDeclaratorId() {
			return getRuleContext(AisDeclaratorIdContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_primary);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(T__42);
				setState(578);
				expression(0);
				setState(579);
				match(T__43);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				match(SELF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(583);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(584);
				match(FALSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(585);
				aisDeclaratorId();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(586);
				literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(587);
				funcCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(588);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public List<FuncArgContext> funcArg() {
			return getRuleContexts(FuncArgContext.class);
		}
		public FuncArgContext funcArg(int i) {
			return getRuleContext(FuncArgContext.class,i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			funcName();
			setState(592);
			match(T__42);
			setState(593);
			funcArg();
			setState(596);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(594);
				match(T__7);
				setState(595);
				funcArg();
				}
			}

			setState(598);
			match(T__43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncNameContext extends ParserRuleContext {
		public TerminalNode FUNC_LOG() { return getToken(RIIF2Parser.FUNC_LOG, 0); }
		public TerminalNode FUNC_EXP() { return getToken(RIIF2Parser.FUNC_EXP, 0); }
		public TerminalNode FUNC_AGG_SINGLE() { return getToken(RIIF2Parser.FUNC_AGG_SINGLE, 0); }
		public TerminalNode FUNC_GT_N_FAIL() { return getToken(RIIF2Parser.FUNC_GT_N_FAIL, 0); }
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncName(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_funcName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FUNC_AGG_SINGLE - 66)) | (1L << (FUNC_GT_N_FAIL - 66)) | (1L << (FUNC_LOG - 66)) | (1L << (FUNC_EXP - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncArgContext extends ParserRuleContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public AisDeclaratorIdContext aisDeclaratorId() {
			return getRuleContext(AisDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncArg(this);
		}
	}

	public final FuncArgContext funcArg() throws RecognitionException {
		FuncArgContext _localctx = new FuncArgContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_funcArg);
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(602);
				aisDeclaratorId();
				}
				setState(603);
				vector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(RIIF2Parser.StringLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(RIIF2Parser.DecimalLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(RIIF2Parser.FloatingPointLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (StringLiteral - 82)) | (1L << (FloatingPointLiteral - 82)) | (1L << (DecimalLiteral - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 45:
			return primitiveId_sempred((PrimitiveIdContext)_localctx, predIndex);
		case 60:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean primitiveId_sempred(PrimitiveIdContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Y\u0265\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\6\2\u0088\n\2\r\2\16\2\u0089"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0092\n\3\3\4\3\4\3\4\5\4\u0097\n\4\3\4\5"+
		"\4\u009a\n\4\3\4\3\4\7\4\u009e\n\4\f\4\16\4\u00a1\13\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u00ac\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7"+
		"\u00b6\n\7\3\b\3\b\5\b\u00ba\n\b\3\b\5\b\u00bd\n\b\3\b\3\b\3\b\5\b\u00c2"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c9\n\b\3\t\3\t\3\t\3\t\5\t\u00cf\n\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r"+
		"\u00e1\n\r\3\r\5\r\u00e4\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00ed"+
		"\n\17\3\17\5\17\u00f0\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0101\n\23\3\23\5\23\u0104\n\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u0112"+
		"\n\25\3\25\3\25\7\25\u0116\n\25\f\25\16\25\u0119\13\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\5\26\u0121\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0132\n\32\f\32\16\32\u0135\13"+
		"\32\3\32\3\32\3\33\3\33\5\33\u013b\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0144\n\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u014c\n\35\f"+
		"\35\16\35\u014f\13\35\3\35\3\35\3\36\3\36\3\36\5\36\u0156\n\36\3\37\3"+
		"\37\3\37\3\37\7\37\u015c\n\37\f\37\16\37\u015f\13\37\3\37\3\37\3 \3 \3"+
		" \5 \u0166\n \3!\3!\3!\3!\7!\u016c\n!\f!\16!\u016f\13!\3!\3!\3\"\3\"\3"+
		"#\3#\5#\u0177\n#\3$\3$\3$\3$\7$\u017d\n$\f$\16$\u0180\13$\3$\3$\3%\3%"+
		"\3%\3%\7%\u0188\n%\f%\16%\u018b\13%\3%\3%\3%\5%\u0190\n%\3&\3&\5&\u0194"+
		"\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\5.\u01a8\n"+
		".\3/\3/\3/\3/\3/\3/\7/\u01b0\n/\f/\16/\u01b3\13/\3\60\3\60\3\60\3\61\3"+
		"\61\5\61\u01ba\n\61\3\61\3\61\3\62\3\62\3\62\5\62\u01c1\n\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u01ce\n\65\f\65\16"+
		"\65\u01d1\13\65\3\66\3\66\3\66\3\66\7\66\u01d7\n\66\f\66\16\66\u01da\13"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\58\u01eb"+
		"\n8\39\39\59\u01ef\n9\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3=\3=\3=\3=\3="+
		"\7=\u0201\n=\f=\16=\u0204\13=\3=\3=\3>\3>\3>\3>\3>\3>\5>\u020e\n>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u021e\n>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\7>\u023f\n>\f>\16>\u0242\13>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\5?\u0250\n?\3@\3@\3@\3@\3@\5@\u0257\n@\3@\3@\3A\3A\3B\3B\3B\3B\5B\u0261"+
		"\nB\3C\3C\3C\2\4\\zD\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\2\17"+
		"\3\2\7\b\3\2:;\4\2SSUV\4\2\20\20SS\3\2<=\3\2\21\22\3\2\23\24\3\2\25\27"+
		"\4\2\7\b\30\31\3\2\32\33\4\2\6\6\",\3\2DG\3\2TV\u027f\2\u0087\3\2\2\2"+
		"\4\u0091\3\2\2\2\6\u0093\3\2\2\2\b\u00ab\3\2\2\2\n\u00ad\3\2\2\2\f\u00b5"+
		"\3\2\2\2\16\u00b7\3\2\2\2\20\u00ca\3\2\2\2\22\u00d0\3\2\2\2\24\u00d4\3"+
		"\2\2\2\26\u00d8\3\2\2\2\30\u00dc\3\2\2\2\32\u00e5\3\2\2\2\34\u00e9\3\2"+
		"\2\2\36\u00f1\3\2\2\2 \u00f5\3\2\2\2\"\u00f9\3\2\2\2$\u00fd\3\2\2\2&\u0108"+
		"\3\2\2\2(\u010e\3\2\2\2*\u0120\3\2\2\2,\u0122\3\2\2\2.\u0125\3\2\2\2\60"+
		"\u0128\3\2\2\2\62\u012d\3\2\2\2\64\u013a\3\2\2\2\66\u013c\3\2\2\28\u0147"+
		"\3\2\2\2:\u0155\3\2\2\2<\u0157\3\2\2\2>\u0165\3\2\2\2@\u0167\3\2\2\2B"+
		"\u0172\3\2\2\2D\u0176\3\2\2\2F\u0178\3\2\2\2H\u018f\3\2\2\2J\u0193\3\2"+
		"\2\2L\u0195\3\2\2\2N\u0197\3\2\2\2P\u0199\3\2\2\2R\u019b\3\2\2\2T\u019d"+
		"\3\2\2\2V\u019f\3\2\2\2X\u01a1\3\2\2\2Z\u01a7\3\2\2\2\\\u01a9\3\2\2\2"+
		"^\u01b4\3\2\2\2`\u01b7\3\2\2\2b\u01c0\3\2\2\2d\u01c2\3\2\2\2f\u01c5\3"+
		"\2\2\2h\u01c9\3\2\2\2j\u01d2\3\2\2\2l\u01db\3\2\2\2n\u01ea\3\2\2\2p\u01ee"+
		"\3\2\2\2r\u01f0\3\2\2\2t\u01f3\3\2\2\2v\u01f9\3\2\2\2x\u01fb\3\2\2\2z"+
		"\u020d\3\2\2\2|\u024f\3\2\2\2~\u0251\3\2\2\2\u0080\u025a\3\2\2\2\u0082"+
		"\u0260\3\2\2\2\u0084\u0262\3\2\2\2\u0086\u0088\5\4\3\2\u0087\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\7\2\2\3\u008c\3\3\2\2\2\u008d\u0092\5\6\4\2"+
		"\u008e\u0092\5(\25\2\u008f\u0092\5\62\32\2\u0090\u0092\58\35\2\u0091\u008d"+
		"\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\5\3\2\2\2\u0093\u0094\7/\2\2\u0094\u0096\7S\2\2\u0095\u0097\5h\65\2\u0096"+
		"\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\5j"+
		"\66\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009f\7\3\2\2\u009c\u009e\5\b\5\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7\60\2\2\u00a3\7\3\2\2\2\u00a4\u00ac\5\n\6"+
		"\2\u00a5\u00ac\5\26\f\2\u00a6\u00ac\5\32\16\2\u00a7\u00ac\5\36\20\2\u00a8"+
		"\u00ac\5 \21\2\u00a9\u00ac\5\"\22\2\u00aa\u00ac\5&\24\2\u00ab\u00a4\3"+
		"\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab"+
		"\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\t\3\2\2\2"+
		"\u00ad\u00ae\5v<\2\u00ae\u00af\5\f\7\2\u00af\u00b0\7\3\2\2\u00b0\13\3"+
		"\2\2\2\u00b1\u00b6\5\16\b\2\u00b2\u00b6\5\20\t\2\u00b3\u00b6\5\22\n\2"+
		"\u00b4\u00b6\5\24\13\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\r\3\2\2\2\u00b7\u00c1\5L\'\2\u00b8"+
		"\u00ba\5p9\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2"+
		"\2\u00bb\u00bd\5d\63\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c2"+
		"\3\2\2\2\u00be\u00bf\5f\64\2\u00bf\u00c0\5d\63\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00b9\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\4"+
		"\2\2\u00c4\u00c5\5n8\2\u00c5\u00c8\3\2\2\2\u00c6\u00c7\7\5\2\2\u00c7\u00c9"+
		"\5:\36\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\17\3\2\2\2\u00ca"+
		"\u00cb\5N(\2\u00cb\u00ce\5f\64\2\u00cc\u00cd\7\5\2\2\u00cd\u00cf\5:\36"+
		"\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\21\3\2\2\2\u00d0\u00d1"+
		"\5P)\2\u00d1\u00d2\7\4\2\2\u00d2\u00d3\7O\2\2\u00d3\23\3\2\2\2\u00d4\u00d5"+
		"\5R*\2\u00d5\u00d6\7\5\2\2\u00d6\u00d7\5@!\2\u00d7\25\3\2\2\2\u00d8\u00d9"+
		"\7\65\2\2\u00d9\u00da\5\30\r\2\u00da\u00db\7\3\2\2\u00db\27\3\2\2\2\u00dc"+
		"\u00dd\5V,\2\u00dd\u00e0\5T+\2\u00de\u00e1\5p9\2\u00df\u00e1\5f\64\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2"+
		"\2\2\u00e2\u00e4\5d\63\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\31\3\2\2\2\u00e5\u00e6\7\66\2\2\u00e6\u00e7\5\34\17\2\u00e7\u00e8\7\3"+
		"\2\2\u00e8\33\3\2\2\2\u00e9\u00ec\5X-\2\u00ea\u00ed\5p9\2\u00eb\u00ed"+
		"\5f\64\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00f0\5d\63\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\35\3\2\2\2\u00f1\u00f2\7J\2\2\u00f2\u00f3\5$\23\2\u00f3\u00f4"+
		"\7\3\2\2\u00f4\37\3\2\2\2\u00f5\u00f6\78\2\2\u00f6\u00f7\5$\23\2\u00f7"+
		"\u00f8\7\3\2\2\u00f8!\3\2\2\2\u00f9\u00fa\7N\2\2\u00fa\u00fb\5$\23\2\u00fb"+
		"\u00fc\7\3\2\2\u00fc#\3\2\2\2\u00fd\u0100\5Z.\2\u00fe\u0101\5p9\2\u00ff"+
		"\u0101\5f\64\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0103\3\2\2\2\u0102\u0104\5d\63\2\u0103\u0102\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\6\2\2\u0106\u0107\5D"+
		"#\2\u0107%\3\2\2\2\u0108\u0109\79\2\2\u0109\u010a\5`\61\2\u010a\u010b"+
		"\t\2\2\2\u010b\u010c\5z>\2\u010c\u010d\7\3\2\2\u010d\'\3\2\2\2\u010e\u010f"+
		"\7H\2\2\u010f\u0111\7S\2\2\u0110\u0112\5h\65\2\u0111\u0110\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0117\7\3\2\2\u0114\u0116\5*"+
		"\26\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7I"+
		"\2\2\u011b)\3\2\2\2\u011c\u0121\5,\27\2\u011d\u0121\5.\30\2\u011e\u0121"+
		"\5\60\31\2\u011f\u0121\5\36\20\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2"+
		"\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121+\3\2\2\2\u0122\u0123"+
		"\7K\2\2\u0123\u0124\5\n\6\2\u0124-\3\2\2\2\u0125\u0126\7K\2\2\u0126\u0127"+
		"\5\32\16\2\u0127/\3\2\2\2\u0128\u0129\7K\2\2\u0129\u012a\7P\2\2\u012a"+
		"\u012b\7S\2\2\u012b\u012c\7\3\2\2\u012c\61\3\2\2\2\u012d\u012e\7\61\2"+
		"\2\u012e\u012f\7S\2\2\u012f\u0133\7\3\2\2\u0130\u0132\5\64\33\2\u0131"+
		"\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7\62\2\2\u0137"+
		"\63\3\2\2\2\u0138\u013b\5 \21\2\u0139\u013b\5\66\34\2\u013a\u0138\3\2"+
		"\2\2\u013a\u0139\3\2\2\2\u013b\65\3\2\2\2\u013c\u013d\t\3\2\2\u013d\u013e"+
		"\7<\2\2\u013e\u013f\5b\62\2\u013f\u0140\7\4\2\2\u0140\u0143\5n8\2\u0141"+
		"\u0142\7\5\2\2\u0142\u0144\5z>\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2"+
		"\2\u0144\u0145\3\2\2\2\u0145\u0146\7\3\2\2\u0146\67\3\2\2\2\u0147\u0148"+
		"\7\63\2\2\u0148\u0149\7S\2\2\u0149\u014d\7\3\2\2\u014a\u014c\5&\24\2\u014b"+
		"\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7\64\2\2\u0151"+
		"9\3\2\2\2\u0152\u0156\5@!\2\u0153\u0156\5z>\2\u0154\u0156\5<\37\2\u0155"+
		"\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156;\3\2\2\2"+
		"\u0157\u0158\7\t\2\2\u0158\u015d\5> \2\u0159\u015a\7\n\2\2\u015a\u015c"+
		"\5> \2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7\13"+
		"\2\2\u0161=\3\2\2\2\u0162\u0166\5z>\2\u0163\u0166\7T\2\2\u0164\u0166\5"+
		"<\37\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166"+
		"?\3\2\2\2\u0167\u0168\7\f\2\2\u0168\u016d\5B\"\2\u0169\u016a\7\n\2\2\u016a"+
		"\u016c\5B\"\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0171\7\r\2\2\u0171A\3\2\2\2\u0172\u0173\t\4\2\2\u0173C\3\2\2\2\u0174"+
		"\u0177\5:\36\2\u0175\u0177\5F$\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2"+
		"\2\u0177E\3\2\2\2\u0178\u0179\7\f\2\2\u0179\u017e\5H%\2\u017a\u017b\7"+
		"\n\2\2\u017b\u017d\5H%\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0181\u0182\7\r\2\2\u0182G\3\2\2\2\u0183\u0184\7\t\2\2\u0184\u0189"+
		"\5J&\2\u0185\u0186\7\n\2\2\u0186\u0188\5J&\2\u0187\u0185\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7\13\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u0190\5z>\2\u018f\u0183\3\2\2\2\u018f\u018e\3\2\2\2\u0190I\3\2\2\2\u0191"+
		"\u0194\5z>\2\u0192\u0194\5@!\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2"+
		"\u0194K\3\2\2\2\u0195\u0196\7S\2\2\u0196M\3\2\2\2\u0197\u0198\7S\2\2\u0198"+
		"O\3\2\2\2\u0199\u019a\7S\2\2\u019aQ\3\2\2\2\u019b\u019c\7S\2\2\u019cS"+
		"\3\2\2\2\u019d\u019e\7S\2\2\u019eU\3\2\2\2\u019f\u01a0\7S\2\2\u01a0W\3"+
		"\2\2\2\u01a1\u01a2\7S\2\2\u01a2Y\3\2\2\2\u01a3\u01a8\5\\/\2\u01a4\u01a8"+
		"\5^\60\2\u01a5\u01a8\5`\61\2\u01a6\u01a8\5l\67\2\u01a7\u01a3\3\2\2\2\u01a7"+
		"\u01a4\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8[\3\2\2\2"+
		"\u01a9\u01aa\b/\1\2\u01aa\u01ab\7S\2\2\u01ab\u01b1\3\2\2\2\u01ac\u01ad"+
		"\f\3\2\2\u01ad\u01ae\7\16\2\2\u01ae\u01b0\7S\2\2\u01af\u01ac\3\2\2\2\u01b0"+
		"\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2]\3\2\2\2"+
		"\u01b3\u01b1\3\2\2\2\u01b4\u01b5\5\\/\2\u01b5\u01b6\5f\64\2\u01b6_\3\2"+
		"\2\2\u01b7\u01b9\5\\/\2\u01b8\u01ba\5f\64\2\u01b9\u01b8\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5d\63\2\u01bca\3\2\2\2"+
		"\u01bd\u01c1\5\\/\2\u01be\u01c1\5^\60\2\u01bf\u01c1\5`\61\2\u01c0\u01bd"+
		"\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1c\3\2\2\2\u01c2"+
		"\u01c3\7\17\2\2\u01c3\u01c4\7S\2\2\u01c4e\3\2\2\2\u01c5\u01c6\7\t\2\2"+
		"\u01c6\u01c7\7S\2\2\u01c7\u01c8\7\13\2\2\u01c8g\3\2\2\2\u01c9\u01ca\7"+
		"\67\2\2\u01ca\u01cf\7S\2\2\u01cb\u01cc\7\n\2\2\u01cc\u01ce\7S\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0i\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7L\2\2\u01d3\u01d8"+
		"\7S\2\2\u01d4\u01d5\7\n\2\2\u01d5\u01d7\7S\2\2\u01d6\u01d4\3\2\2\2\u01d7"+
		"\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9k\3\2\2\2"+
		"\u01da\u01d8\3\2\2\2\u01db\u01dc\5`\61\2\u01dc\u01dd\7\t\2\2\u01dd\u01de"+
		"\t\5\2\2\u01de\u01df\7\13\2\2\u01df\u01e0\7\t\2\2\u01e0\u01e1\7S\2\2\u01e1"+
		"\u01e2\7\13\2\2\u01e2m\3\2\2\2\u01e3\u01eb\7>\2\2\u01e4\u01eb\7?\2\2\u01e5"+
		"\u01eb\7@\2\2\u01e6\u01eb\7B\2\2\u01e7\u01eb\7C\2\2\u01e8\u01eb\7S\2\2"+
		"\u01e9\u01eb\5x=\2\u01ea\u01e3\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea\u01e5"+
		"\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01e9\3\2\2\2\u01ebo\3\2\2\2\u01ec\u01ef\5r:\2\u01ed\u01ef\5t;\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01efq\3\2\2\2\u01f0\u01f1\7\t\2\2"+
		"\u01f1\u01f2\7\13\2\2\u01f2s\3\2\2\2\u01f3\u01f4\7\t\2\2\u01f4\u01f5\5"+
		"z>\2\u01f5\u01f6\7\4\2\2\u01f6\u01f7\5z>\2\u01f7\u01f8\7\13\2\2\u01f8"+
		"u\3\2\2\2\u01f9\u01fa\t\6\2\2\u01faw\3\2\2\2\u01fb\u01fc\7A\2\2\u01fc"+
		"\u01fd\7\f\2\2\u01fd\u0202\7S\2\2\u01fe\u01ff\7\n\2\2\u01ff\u0201\7S\2"+
		"\2\u0200\u01fe\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0206\7\r\2\2\u0206"+
		"y\3\2\2\2\u0207\u0208\b>\1\2\u0208\u020e\5|?\2\u0209\u020a\t\7\2\2\u020a"+
		"\u020e\5z>\20\u020b\u020c\t\b\2\2\u020c\u020e\5z>\17\u020d\u0207\3\2\2"+
		"\2\u020d\u0209\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0240\3\2\2\2\u020f\u0210"+
		"\f\16\2\2\u0210\u0211\t\t\2\2\u0211\u023f\5z>\17\u0212\u0213\f\r\2\2\u0213"+
		"\u0214\t\7\2\2\u0214\u023f\5z>\16\u0215\u021d\f\f\2\2\u0216\u0217\7\7"+
		"\2\2\u0217\u021e\7\7\2\2\u0218\u0219\7\b\2\2\u0219\u021a\7\b\2\2\u021a"+
		"\u021e\7\b\2\2\u021b\u021c\7\b\2\2\u021c\u021e\7\b\2\2\u021d\u0216\3\2"+
		"\2\2\u021d\u0218\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u023f\5z>\r\u0220\u0221\f\13\2\2\u0221\u0222\t\n\2\2\u0222\u023f\5z>"+
		"\f\u0223\u0224\f\n\2\2\u0224\u0225\t\13\2\2\u0225\u023f\5z>\13\u0226\u0227"+
		"\f\t\2\2\u0227\u0228\7\34\2\2\u0228\u023f\5z>\n\u0229\u022a\f\b\2\2\u022a"+
		"\u022b\7\35\2\2\u022b\u023f\5z>\t\u022c\u022d\f\7\2\2\u022d\u022e\7\36"+
		"\2\2\u022e\u023f\5z>\b\u022f\u0230\f\6\2\2\u0230\u0231\7\37\2\2\u0231"+
		"\u023f\5z>\7\u0232\u0233\f\5\2\2\u0233\u0234\7 \2\2\u0234\u023f\5z>\6"+
		"\u0235\u0236\f\4\2\2\u0236\u0237\7!\2\2\u0237\u0238\5z>\2\u0238\u0239"+
		"\7\4\2\2\u0239\u023a\5z>\5\u023a\u023f\3\2\2\2\u023b\u023c\f\3\2\2\u023c"+
		"\u023d\t\f\2\2\u023d\u023f\5z>\3\u023e\u020f\3\2\2\2\u023e\u0212\3\2\2"+
		"\2\u023e\u0215\3\2\2\2\u023e\u0220\3\2\2\2\u023e\u0223\3\2\2\2\u023e\u0226"+
		"\3\2\2\2\u023e\u0229\3\2\2\2\u023e\u022c\3\2\2\2\u023e\u022f\3\2\2\2\u023e"+
		"\u0232\3\2\2\2\u023e\u0235\3\2\2\2\u023e\u023b\3\2\2\2\u023f\u0242\3\2"+
		"\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241{\3\2\2\2\u0242\u0240"+
		"\3\2\2\2\u0243\u0244\7-\2\2\u0244\u0245\5z>\2\u0245\u0246\7.\2\2\u0246"+
		"\u0250\3\2\2\2\u0247\u0250\7M\2\2\u0248\u0250\7S\2\2\u0249\u0250\7Q\2"+
		"\2\u024a\u0250\7R\2\2\u024b\u0250\5Z.\2\u024c\u0250\5\u0084C\2\u024d\u0250"+
		"\5~@\2\u024e\u0250\5<\37\2\u024f\u0243\3\2\2\2\u024f\u0247\3\2\2\2\u024f"+
		"\u0248\3\2\2\2\u024f\u0249\3\2\2\2\u024f\u024a\3\2\2\2\u024f\u024b\3\2"+
		"\2\2\u024f\u024c\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u024e\3\2\2\2\u0250"+
		"}\3\2\2\2\u0251\u0252\5\u0080A\2\u0252\u0253\7-\2\2\u0253\u0256\5\u0082"+
		"B\2\u0254\u0255\7\n\2\2\u0255\u0257\5\u0082B\2\u0256\u0254\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\7.\2\2\u0259\177\3\2\2"+
		"\2\u025a\u025b\t\r\2\2\u025b\u0081\3\2\2\2\u025c\u025d\5Z.\2\u025d\u025e"+
		"\5t;\2\u025e\u0261\3\2\2\2\u025f\u0261\5z>\2\u0260\u025c\3\2\2\2\u0260"+
		"\u025f\3\2\2\2\u0261\u0083\3\2\2\2\u0262\u0263\t\16\2\2\u0263\u0085\3"+
		"\2\2\2\64\u0089\u0091\u0096\u0099\u009f\u00ab\u00b5\u00b9\u00bc\u00c1"+
		"\u00c8\u00ce\u00e0\u00e3\u00ec\u00ef\u0100\u0103\u0111\u0117\u0120\u0133"+
		"\u013a\u0143\u014d\u0155\u015d\u0165\u016d\u0176\u017e\u0189\u018f\u0193"+
		"\u01a7\u01b1\u01b9\u01c0\u01cf\u01d8\u01ea\u01ee\u0202\u020d\u021d\u023e"+
		"\u0240\u024f\u0256\u0260";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}