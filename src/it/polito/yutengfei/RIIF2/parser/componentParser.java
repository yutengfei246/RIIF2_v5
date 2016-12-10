package it.polito.yutengfei.RIIF2.parser;

import it.polito.yutengfei.RIIF2.RIIF2Parser;
import it.polito.yutengfei.RIIF2.factory.ComponentFactory;
import it.polito.yutengfei.RIIF2.factory.EntityPreparedException;
import it.polito.yutengfei.RIIF2.factory.EntityValueNotSuitableExpcetion;
import it.polito.yutengfei.RIIF2.factory.Factory;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * Created by yutengfei on 09/12/16.
 */
public class componentParser extends InitializerParser{

    private ComponentFactory componentFactory = Factory.newComponentFactory();

    public componentParser(RIIF2Parser parser){
        super(parser);
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
    public void enterFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx) {
        try {
            this.componentFactory.prepare(ComponentFactory.FIELD);
        } catch (EntityPreparedException e) {
            e.printStackTrace();
            //TODO: exception
        }
    }

    @Override
    public void enterFieldType(RIIF2Parser.FieldTypeContext ctx) {
        TerminalNode parameter = ctx.PARAMETER();
        TerminalNode constant = ctx.CONSTANT();

        if (parameter != null)
            try {
                this.componentFactory.prepareField(ComponentFactory.PARAMETER);
            } catch (EntityPreparedException e) {
                e.printStackTrace();
                //TODO: exception
            }

        if (constant != null)
            try {
                this.componentFactory.prepareField(ComponentFactory.CONSTANT);
            } catch (EntityPreparedException e) {
                e.printStackTrace();
                //TODO: exception
            }
    }

    @Override
    public void enterPrimitiveFieldDeclaratorId(RIIF2Parser.PrimitiveFieldDeclaratorIdContext ctx) {
        TerminalNode Identifier = ctx.Identifier();
        String identifier = Identifier.getText();

        this.componentFactory.setEntityIdentifier( identifier );
    }

    @Override
    public void enterAssociativeId(RIIF2Parser.AssociativeIdContext ctx) {
        this.componentFactory.setEntityTypeType(ComponentFactory.TYPE_ASSOCIATIVE);
    }

    @Override
    public void enterVector(RIIF2Parser.VectorContext ctx) {
        ParserRuleContext parentContext = ctx.getParent();

        if( parentContext instanceof RIIF2Parser.TypeTypeContext){
            this.componentFactory.setEntityTypeType(ComponentFactory.TYPE_VECTOR);
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

        if( !expLeft.isInteger() || !expRight.isInteger() ){
            //TODO: exception here should exit
        }

        ParserRuleContext parentContext = ctx.getParent();
        if(parentContext instanceof RIIF2Parser.TypeTypeContext){
            int vecLeft = (Integer)expLeft.getValue();
            int vecRight = (Integer)expRight.getValue();
            this.componentFactory.setEntityVector(vecLeft,vecRight);
        }

    }

    @Override
    public void enterAttributeIndex(RIIF2Parser.AttributeIndexContext ctx) {
        ParserRuleContext parentContext = ctx.getParent();

        if( parentContext instanceof RIIF2Parser.PrimitiveFieldDeclaratorContext){
            this.componentFactory.setEntityIsAttribute();
        }
    }

    @Override
    public void enterAssociativeIndex(RIIF2Parser.AssociativeIndexContext ctx) {
        ParserRuleContext parentContext = ctx.getParent();

        if( parentContext instanceof RIIF2Parser.PrimitiveFieldDeclaratorContext ){
            TerminalNode Identifier = ctx.Identifier();
            String identifier = Identifier.getText();

            this.componentFactory.setEntityIsAssociativeIndex(identifier);
        }
    }

    @Override
    public void enterPrimitiveType(RIIF2Parser.PrimitiveTypeContext ctx) {

        if( ctx.TYPE_BOOLEAN() != null )
            this.componentFactory.setEntityType(ComponentFactory.BOOLEAN);
        if( ctx.TYPE_FLOAT() != null)
            this.componentFactory.setEntityType(ComponentFactory.FLOAT);
        if( ctx.TYPE_INTEGER() != null)
            this.componentFactory.setEntityType(ComponentFactory.INTEGER);
        if( ctx.TYPE_STRING() != null )
            this.componentFactory.setEntityType(ComponentFactory.STRING);
        if( ctx.TYPE_TIME() != null)
            this.componentFactory.setEntityType(ComponentFactory.TIME);
        if( ctx.Identifier() != null) {
            this.componentFactory.setEntityType(ComponentFactory.USER_DEFINED);

            String identifier = ctx.Identifier().getText();
            this.componentFactory.setEntityTypeDefinedByUser( identifier );
        }
    }

    @Override
    public void enterEnumType(RIIF2Parser.EnumTypeContext ctx) {
        this.componentFactory.setEntityType(ComponentFactory.ENUM);

        List<TerminalNode> items = ctx.Identifier();
        for (TerminalNode item : items ){
            String enumName = item.getText();
            this.componentFactory.setEntityEnumType(enumName);
        }
    }

    // this method is used only for checking for efficiency because  at the time being the Field( expression ) has not value available
    @Override
    public void enterFieldInitializer(RIIF2Parser.FieldInitializerContext ctx) {
        RIIF2Parser.ListInitializerContext listInitializerContext
                = ctx.listInitializer();

        RIIF2Parser.ExpressionContext expressionContext
                = ctx.expression();

        RIIF2Parser.ArrayInitializerContext arrayInitializerContext
                = ctx.arrayInitializer();

        if( listInitializerContext != null && this.componentFactory.isEntityList()){}
        else{
            //TODO: exception
        }

        if( arrayInitializerContext != null && this.componentFactory.isArrayEntity()){}
        else{
            //TODO: exception
        }

        if( expressionContext != null && this.componentFactory.isPrimitiveEntity()){}
        else{
            //TODO: exception
        }
    }

    @Override
    public void exitListInitializer(RIIF2Parser.ListInitializerContext ctx) {
        ParserRuleContext parentContext = ctx.getParent();

        if( parentContext instanceof RIIF2Parser.FieldInitializerContext ){

        }
    }

    @Override
    public void exitFieldInitializer(RIIF2Parser.FieldInitializerContext ctx) {
        RIIF2Parser.ExpressionContext expressionContext
                = ctx.expression();

        if (expressionContext != null) {
            Expression expression = super.getExpression(expressionContext);
            this.setEntityValue(expression);
        }
    }

    private void setEntityValue(Expression expression) {
        int expType = expression.getType();
        try {
            switch (expType) {
                case Expression.BOOLEAN:
                    Boolean valueBoolean = (Boolean) expression.getValue();
                    this.componentFactory.setEntityValue(valueBoolean);
                    break;
                case Expression.FLOAT:
                    Float valueFloat = (Float) expression.getValue();
                    this.componentFactory.setEntityValue(valueFloat);
                    break;
                case Expression.INTEGER:
                    Integer valueInteger = (Integer) expression.getValue();
                    this.componentFactory.setEntityValue(valueInteger);
                    break;
                case Expression.STRING:
                    String valueString = (String) expression.getValue();
                    this.componentFactory.setEntityValue(valueString);
                    break;
                case Expression.SELF:
                    this.componentFactory.setEntityValue(new ComponentFactory.Self());
                    break;
                default:
                    //TODO: exception
            }
        }catch (EntityValueNotSuitableExpcetion e){
            //TODO: exception
        }
    }


}
