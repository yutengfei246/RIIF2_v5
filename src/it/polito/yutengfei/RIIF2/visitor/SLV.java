package it.polito.yutengfei.RIIF2.visitor;

import it.polito.yutengfei.RIIF2.RIIF2BaseVisitor;
import it.polito.yutengfei.RIIF2.RIIF2Parser;
import it.polito.yutengfei.RIIF2.factory.Factory;
import it.polito.yutengfei.RIIF2.parser.ComponentParser;
import it.polito.yutengfei.RIIF2.parser.TemplateParser;
import it.polito.yutengfei.RIIF2.parser.utilityRecoder.Recoder;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Second Level Visitor
 */
public class SLV extends RIIF2BaseVisitor<Boolean> {

    // keeping the tree for listener
    private final ParseTree parseTree;
    private final RIIF2Parser parser;

    private final ComponentParser componentParser;
    private final TemplateParser templateParser;

    private int moduleCounter = -1;
    private final ParseTreeWalker walker = new ParseTreeWalker();

    public SLV (ParseTree parseTree, RIIF2Parser parser){
        this.parser = parser;
        this.parseTree = parseTree;
        this.componentParser = new ComponentParser(this.parser, new Recoder());
        this.templateParser = new TemplateParser(this.parser , new Recoder());
    }

    @Override
    public Boolean visitComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx) {
        super.visitComponentDeclaration(ctx);

        this.moduleCounter++;
        ParseTree componentTree = this.parseTree.getChild(this.moduleCounter);
        walker.walk(this.componentParser,componentTree);

        return true;
    }


    @Override
    public Boolean visitTemplateDeclaration(RIIF2Parser.TemplateDeclarationContext ctx) {
        super.visitTemplateDeclaration(ctx);

        this.moduleCounter++;
        ParseTree templateTree = this.parseTree.getChild(this.moduleCounter);
        walker.walk(this.templateParser,templateTree);

        return true;
    }

}