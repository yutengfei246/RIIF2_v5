// Generated from /usr/Intellij/ANtlr4WorkSpace/RIIF2_v5/RIIF2.g4 by ANTLR 4.5.3
package it.polito.yutengfei.RIIF2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RIIF2Parser}.
 */
public interface RIIF2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RIIF2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RIIF2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(RIIF2Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(RIIF2Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#componentBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterComponentBodyElement(RIIF2Parser.ComponentBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#componentBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitComponentBodyElement(RIIF2Parser.ComponentBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#fieldDeclaratorType}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaratorType(RIIF2Parser.FieldDeclaratorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#fieldDeclaratorType}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaratorType(RIIF2Parser.FieldDeclaratorTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#primitiveFieldDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveFieldDeclarator(RIIF2Parser.PrimitiveFieldDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#primitiveFieldDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveFieldDeclarator(RIIF2Parser.PrimitiveFieldDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#associativeIndexDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeIndexDeclarator(RIIF2Parser.AssociativeIndexDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#associativeIndexDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeIndexDeclarator(RIIF2Parser.AssociativeIndexDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#tableFieldDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterTableFieldDeclarator(RIIF2Parser.TableFieldDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#tableFieldDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitTableFieldDeclarator(RIIF2Parser.TableFieldDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#listFieldDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterListFieldDeclarator(RIIF2Parser.ListFieldDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#listFieldDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitListFieldDeclarator(RIIF2Parser.ListFieldDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#childComponentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterChildComponentDeclaration(RIIF2Parser.ChildComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#childComponentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitChildComponentDeclaration(RIIF2Parser.ChildComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#childComponentDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterChildComponentDeclarator(RIIF2Parser.ChildComponentDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#childComponentDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitChildComponentDeclarator(RIIF2Parser.ChildComponentDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#failModeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFailModeDeclaration(RIIF2Parser.FailModeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#failModeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFailModeDeclaration(RIIF2Parser.FailModeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#failModeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterFailModeDeclarator(RIIF2Parser.FailModeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#failModeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitFailModeDeclarator(RIIF2Parser.FailModeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#imposeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImposeDeclaration(RIIF2Parser.ImposeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#imposeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImposeDeclaration(RIIF2Parser.ImposeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RIIF2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RIIF2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#setTemplateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSetTemplateDeclaration(RIIF2Parser.SetTemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#setTemplateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSetTemplateDeclaration(RIIF2Parser.SetTemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignmentAndImposeAndSetDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentAndImposeAndSetDeclarator(RIIF2Parser.AssignmentAndImposeAndSetDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignmentAndImposeAndSetDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentAndImposeAndSetDeclarator(RIIF2Parser.AssignmentAndImposeAndSetDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(RIIF2Parser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(RIIF2Parser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDeclaration(RIIF2Parser.TemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDeclaration(RIIF2Parser.TemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#templateBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBodyElement(RIIF2Parser.TemplateBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#templateBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBodyElement(RIIF2Parser.TemplateBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#abstractFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractFieldDeclaration(RIIF2Parser.AbstractFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#abstractFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractFieldDeclaration(RIIF2Parser.AbstractFieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#abstractFailModeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractFailModeDeclaration(RIIF2Parser.AbstractFailModeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#abstractFailModeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractFailModeDeclaration(RIIF2Parser.AbstractFailModeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#abstractPlatformDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractPlatformDeclaration(RIIF2Parser.AbstractPlatformDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#abstractPlatformDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractPlatformDeclaration(RIIF2Parser.AbstractPlatformDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#environmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentDeclaration(RIIF2Parser.EnvironmentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#environmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentDeclaration(RIIF2Parser.EnvironmentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#environmentBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentBodyElement(RIIF2Parser.EnvironmentBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#environmentBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentBodyElement(RIIF2Parser.EnvironmentBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#envParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnvParameterDeclaration(RIIF2Parser.EnvParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#envParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnvParameterDeclaration(RIIF2Parser.EnvParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#requirementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRequirementDeclaration(RIIF2Parser.RequirementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#requirementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRequirementDeclaration(RIIF2Parser.RequirementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#fieldInitializer}.
	 * @param ctx the parse tree
	 */
	void enterFieldInitializer(RIIF2Parser.FieldInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#fieldInitializer}.
	 * @param ctx the parse tree
	 */
	void exitFieldInitializer(RIIF2Parser.FieldInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(RIIF2Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(RIIF2Parser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void enterArrayItem(RIIF2Parser.ArrayItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void exitArrayItem(RIIF2Parser.ArrayItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#listInitializer}.
	 * @param ctx the parse tree
	 */
	void enterListInitializer(RIIF2Parser.ListInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#listInitializer}.
	 * @param ctx the parse tree
	 */
	void exitListInitializer(RIIF2Parser.ListInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#listItem}.
	 * @param ctx the parse tree
	 */
	void enterListItem(RIIF2Parser.ListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#listItem}.
	 * @param ctx the parse tree
	 */
	void exitListItem(RIIF2Parser.ListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#aisInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAisInitializer(RIIF2Parser.AisInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#aisInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAisInitializer(RIIF2Parser.AisInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#tableItemInitializer}.
	 * @param ctx the parse tree
	 */
	void enterTableItemInitializer(RIIF2Parser.TableItemInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#tableItemInitializer}.
	 * @param ctx the parse tree
	 */
	void exitTableItemInitializer(RIIF2Parser.TableItemInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(RIIF2Parser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(RIIF2Parser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#rowItem}.
	 * @param ctx the parse tree
	 */
	void enterRowItem(RIIF2Parser.RowItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#rowItem}.
	 * @param ctx the parse tree
	 */
	void exitRowItem(RIIF2Parser.RowItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#primitiveFieldDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveFieldDeclaratorId(RIIF2Parser.PrimitiveFieldDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#primitiveFieldDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveFieldDeclaratorId(RIIF2Parser.PrimitiveFieldDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#associativeIndexDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeIndexDeclaratorId(RIIF2Parser.AssociativeIndexDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#associativeIndexDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeIndexDeclaratorId(RIIF2Parser.AssociativeIndexDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#tableFieldDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterTableFieldDeclaratorId(RIIF2Parser.TableFieldDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#tableFieldDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitTableFieldDeclaratorId(RIIF2Parser.TableFieldDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#listFieldDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterListFieldDeclaratorId(RIIF2Parser.ListFieldDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#listFieldDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitListFieldDeclaratorId(RIIF2Parser.ListFieldDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#childComponentDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterChildComponentDeclaratorId(RIIF2Parser.ChildComponentDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#childComponentDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitChildComponentDeclaratorId(RIIF2Parser.ChildComponentDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#childComponentTypeId}.
	 * @param ctx the parse tree
	 */
	void enterChildComponentTypeId(RIIF2Parser.ChildComponentTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#childComponentTypeId}.
	 * @param ctx the parse tree
	 */
	void exitChildComponentTypeId(RIIF2Parser.ChildComponentTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#failModeDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterFailModeDeclaratorId(RIIF2Parser.FailModeDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#failModeDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitFailModeDeclaratorId(RIIF2Parser.FailModeDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#aisDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterAisDeclaratorId(RIIF2Parser.AisDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#aisDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitAisDeclaratorId(RIIF2Parser.AisDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#primitiveId}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveId(RIIF2Parser.PrimitiveIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#primitiveId}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveId(RIIF2Parser.PrimitiveIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#associativeId}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeId(RIIF2Parser.AssociativeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#associativeId}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeId(RIIF2Parser.AssociativeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#attributeId}.
	 * @param ctx the parse tree
	 */
	void enterAttributeId(RIIF2Parser.AttributeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#attributeId}.
	 * @param ctx the parse tree
	 */
	void exitAttributeId(RIIF2Parser.AttributeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#variableId}.
	 * @param ctx the parse tree
	 */
	void enterVariableId(RIIF2Parser.VariableIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#variableId}.
	 * @param ctx the parse tree
	 */
	void exitVariableId(RIIF2Parser.VariableIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#attributeIndex}.
	 * @param ctx the parse tree
	 */
	void enterAttributeIndex(RIIF2Parser.AttributeIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#attributeIndex}.
	 * @param ctx the parse tree
	 */
	void exitAttributeIndex(RIIF2Parser.AttributeIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#associativeIndex}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeIndex(RIIF2Parser.AssociativeIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#associativeIndex}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeIndex(RIIF2Parser.AssociativeIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#extendsList}.
	 * @param ctx the parse tree
	 */
	void enterExtendsList(RIIF2Parser.ExtendsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#extendsList}.
	 * @param ctx the parse tree
	 */
	void exitExtendsList(RIIF2Parser.ExtendsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#implementsList}.
	 * @param ctx the parse tree
	 */
	void enterImplementsList(RIIF2Parser.ImplementsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#implementsList}.
	 * @param ctx the parse tree
	 */
	void exitImplementsList(RIIF2Parser.ImplementsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#tableId}.
	 * @param ctx the parse tree
	 */
	void enterTableId(RIIF2Parser.TableIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#tableId}.
	 * @param ctx the parse tree
	 */
	void exitTableId(RIIF2Parser.TableIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(RIIF2Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(RIIF2Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(RIIF2Parser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(RIIF2Parser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#associativeType}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeType(RIIF2Parser.AssociativeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#associativeType}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeType(RIIF2Parser.AssociativeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(RIIF2Parser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(RIIF2Parser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#fieldType}.
	 * @param ctx the parse tree
	 */
	void enterFieldType(RIIF2Parser.FieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#fieldType}.
	 * @param ctx the parse tree
	 */
	void exitFieldType(RIIF2Parser.FieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#enumType}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(RIIF2Parser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#enumType}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(RIIF2Parser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RIIF2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RIIF2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(RIIF2Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(RIIF2Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(RIIF2Parser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(RIIF2Parser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(RIIF2Parser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(RIIF2Parser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterFuncArg(RIIF2Parser.FuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitFuncArg(RIIF2Parser.FuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(RIIF2Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(RIIF2Parser.LiteralContext ctx);
}