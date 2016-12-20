package it.polito.yutengfei.RIIF2.parser;

import it.polito.yutengfei.RIIF2.RIIF2Parser;
import it.polito.yutengfei.RIIF2.factory.*;
import it.polito.yutengfei.RIIF2.recoder.RIIF2Recorder;
import it.polito.yutengfei.RIIF2.recoder.Recorder;
import it.polito.yutengfei.RIIF2.util.RIIF2Grammar;
import it.polito.yutengfei.RIIF2.util.utilityWrapper.ArrayItem;
import it.polito.yutengfei.RIIF2.util.utilityWrapper.Expression;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;


public class ComponentParser extends IdentifierParser implements Recorder {

    private ComponentFactory componentFactory = null;

    public ComponentParser(RIIF2Parser parser, RIIF2Recorder recorder){
        super(parser);
        this.componentFactory = Factory.newComponentFactory(recorder);
    }

    @Override
    public void enterComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx) {
        this.componentFactory.start();

        TerminalNode Identifier = ctx.Identifier();
        String identifier = Identifier.getText();

        this.componentFactory.setCurrentComponentIdentifier(identifier);
    }

    @Override
    public void enterExtendsList(RIIF2Parser.ExtendsListContext ctx) {
        List<TerminalNode>  Identifiers = ctx.Identifier();

        if( Identifiers.size() != 0)
            this.componentFactory.startImplEx();

        for (TerminalNode Identifier : Identifiers){
            String identifier = Identifier.getText();
            this.componentFactory.setCurrentComponentExtendsIdentifier(identifier);
        }
    }

    @Override
    public void enterImplementsList(RIIF2Parser.ImplementsListContext ctx) {
        List<TerminalNode> Identifiers = ctx.Identifier();
        for(TerminalNode Identifier : Identifiers){
            String identifier = Identifier.getText();
            this.componentFactory.setCurrentComponentImplementsIdentifier(identifier);
        }
    }

    @Override
    public void exitImplementsList(RIIF2Parser.ImplementsListContext ctx) {
        this.componentFactory.commitImplEx();
    }

    @Override
    public void enterFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx) {
        this.componentFactory.startField();
    }

    @Override
    public void enterFieldType(RIIF2Parser.FieldTypeContext ctx) {
        TerminalNode parameter = ctx.PARAMETER();
        TerminalNode constant = ctx.CONSTANT();

        if (parameter != null)
            this.componentFactory.setFieldType( RIIF2Grammar.PARAMETER );
        if (constant != null)
            this.componentFactory.setFieldType( RIIF2Grammar.CONSTANT );
    }

    @Override
    public void enterPrimitiveFieldDeclarator(RIIF2Parser.PrimitiveFieldDeclaratorContext ctx) {
        this.componentFactory.setFieldAttribute(false);
    }

    @Override
    public void enterPrimitiveFieldDeclaratorId(RIIF2Parser.PrimitiveFieldDeclaratorIdContext ctx) {
        TerminalNode Identifier = ctx.Identifier();
        String identifier = Identifier.getText();

        this.componentFactory.setFieldIdentifier( identifier );
    }

    @Override
    public void enterAssociativeType(RIIF2Parser.AssociativeTypeContext ctx) {
        this.componentFactory.setFieldTypeType(RIIF2Grammar.TYPE_TYPE_ASSOCIATIVE);
    }

    @Override
    public void enterVector(RIIF2Parser.VectorContext ctx) {
        ParserRuleContext parentContext = ctx.getParent();

        if( parentContext instanceof RIIF2Parser.TypeTypeContext){
            this.componentFactory.setFieldTypeType(RIIF2Grammar.TYPE_TYPE_VECTOR);
        }
    }

    @Override
    public void exitVector(RIIF2Parser.VectorContext ctx) {
        RIIF2Parser.ExpressionContext expCtxLeft
                = ctx.expression(0);

        RIIF2Parser.ExpressionContext expCtxRight
                = ctx.expression(1);


        Expression expLeft = super.getExpression(expCtxLeft);
        Expression expRight = super.getExpression(expCtxRight);

        if( !expLeft.isPositiveInteger() || !expRight.isPositiveInteger() ){
            //TODO: exception here should exit
        }

        ParserRuleContext parentContext = ctx.getParent();
        if(parentContext instanceof RIIF2Parser.TypeTypeContext &&
                expLeft.isPositiveInteger() &&
                expRight.isPositiveInteger() ){

            int vecLeft = (Integer)expLeft.getValue();
            int vecRight = (Integer)expRight.getValue();
            this.componentFactory.setFieldVector(vecLeft,vecRight);
        }

    }

    @Override
    public void enterAttributeIndex(RIIF2Parser.AttributeIndexContext ctx) {
        ParserRuleContext parentContext = ctx.getParent();
        TerminalNode Identifier = ctx.Identifier();
        String identifier = Identifier.getText();

        if( parentContext instanceof RIIF2Parser.PrimitiveFieldDeclaratorContext){
            this.componentFactory.setFieldAttribute(true);
            this.componentFactory.setFieldAttributeIndex(identifier);
        }
    }

    @Override
    public void enterAssociativeIndex(RIIF2Parser.AssociativeIndexContext ctx) {
        ParserRuleContext parentContext = ctx.getParent();
        TerminalNode Identifier = ctx.Identifier();
        String identifier = Identifier.getText();

        if( parentContext instanceof RIIF2Parser.PrimitiveFieldDeclaratorContext ){
            this.componentFactory.setFieldAssociative(true);
            this.componentFactory.setFieldAssociativeIndex(identifier);
        }
    }

    @Override
    public void enterPrimitiveType(RIIF2Parser.PrimitiveTypeContext ctx) {

        if( ctx.TYPE_BOOLEAN() != null )
            this.componentFactory.setFieldVariableType(RIIF2Grammar.BOOLEAN);
        if( ctx.TYPE_FLOAT() != null)
            this.componentFactory.setFieldVariableType(RIIF2Grammar.DOUBLE);
        if( ctx.TYPE_INTEGER() != null)
            this.componentFactory.setFieldVariableType(RIIF2Grammar.INTEGER);
        if( ctx.TYPE_STRING() != null )
            this.componentFactory.setFieldVariableType(RIIF2Grammar.STRING);
        if( ctx.TYPE_TIME() != null)
            this.componentFactory.setFieldVariableType(RIIF2Grammar.TIME);
        if( ctx.Identifier() != null) {
            String identifier = ctx.Identifier().getText();
            this.componentFactory.setFieldVariableType(RIIF2Grammar.USER_DEFINED,identifier);
        }
    }

    @Override
    public void enterEnumType(RIIF2Parser.EnumTypeContext ctx) {
        this.componentFactory.setFieldVariableType(RIIF2Grammar.ENUM);

        List<TerminalNode> items = ctx.Identifier();
        for (TerminalNode item : items ){
            String enumName = item.getText();
            this.componentFactory.addFieldEnumType(enumName);
        }
    }

    @Override
    public void exitFieldInitializer(RIIF2Parser.FieldInitializerContext ctx) {
        ParserRuleContext parentContext = ctx.getParent();

        RIIF2Parser.ListInitializerContext listInitializerContext
                = ctx.listInitializer();

        RIIF2Parser.ExpressionContext expressionContext
                = ctx.expression();

        RIIF2Parser.ArrayInitializerWrapperContext arrayInitializerWrapperContext
                = ctx.arrayInitializerWrapper();

        if( parentContext instanceof RIIF2Parser.PrimitiveFieldDeclaratorContext) {
            if (listInitializerContext != null) {
                this.componentFactory.setFieldInitializerType(RIIF2Grammar.LIST_INITIALIZER);

                List<String> listInitializer = super.getListInitializer();
                this.componentFactory.setFieldInitializer(listInitializer);
            }

            if (arrayInitializerWrapperContext != null) {
                this.componentFactory.setFieldInitializerType(RIIF2Grammar.ARRAY_INITIALIZER);

                List<List<ArrayItem>> arrayWrapperInitializer = super.getArrayWrapperInitializer();
                this.componentFactory.setFieldInitializer(arrayWrapperInitializer);
            }

            if (expressionContext != null) {
                this.componentFactory.setFieldInitializerType(RIIF2Grammar.EXPRESSION);

                Expression expression = super.getExpression(expressionContext);
                this.componentFactory.setFieldInitializer(expression);
            }
        }
    }

    @Override
    public void exitFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx) {
        this.componentFactory.commitField();
    }

    @Override
    public void exitComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx) {
        this.componentFactory.commit();
        this.componentFactory.productComponent();
    }


    @Override
    public RIIF2Recorder getRIIF2Recorder() {
        return this.componentFactory.getRIIF2Recorder();
    }
}
