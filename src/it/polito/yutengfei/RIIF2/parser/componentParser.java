package it.polito.yutengfei.RIIF2.parser;

import it.polito.yutengfei.RIIF2.RIIF2BaseListener;
import it.polito.yutengfei.RIIF2.RIIF2Parser;
import it.polito.yutengfei.RIIF2.factory.ComponentFactory;
import it.polito.yutengfei.RIIF2.factory.EntityPreparedException;
import it.polito.yutengfei.RIIF2.factory.Factory;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * Created by yutengfei on 09/12/16.
 */
public class componentParser extends RIIF2BaseListener {


    private final RIIF2Parser parser;
    private ComponentFactory componentFactory = Factory.newComponentFactory();

    public componentParser(RIIF2Parser parser){
        this.parser = parser;
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
                this.componentFactory.prepare(ComponentFactory.PARAMETER);
            } catch (EntityPreparedException e) {
                e.printStackTrace();
                //TODO: exception
            }

        if (constant != null)
            try {
                this.componentFactory.prepare(ComponentFactory.CONSTANT);
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

    

}
