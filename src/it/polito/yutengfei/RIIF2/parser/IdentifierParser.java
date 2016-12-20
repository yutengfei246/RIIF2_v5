package it.polito.yutengfei.RIIF2.parser;

import it.polito.yutengfei.RIIF2.RIIF2Parser;
import it.polito.yutengfei.RIIF2.util.utilityWrapper.URI;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

abstract class IdentifierParser extends InitializerParser {

    IdentifierParser(RIIF2Parser parser) {
        super(parser);
    }

    ParseTreeProperty<URI> uriParseTreeProperty = new ParseTreeProperty<>();

    public void putURI(ParseTree ctx, URI uri){
        this.uriParseTreeProperty.put(ctx,uri);
    }

    public URI getURI(ParseTree ctx){
        return this.uriParseTreeProperty.get(ctx);
    }

    @Override
    public void enterPrimitiveIdIdentifier(RIIF2Parser.PrimitiveIdIdentifierContext ctx) {
        TerminalNode Identifier = ctx.Identifier();
        String identifier = Identifier.getText();

        URI uri = URI.fromText( identifier );
        this.putURI(ctx,uri);
    }

    @Override
    public void exitPrimitiveIdId(RIIF2Parser.PrimitiveIdIdContext ctx) {
        RIIF2Parser.PrimitiveIdContext primitiveIdContext
            =  ctx.primitiveId();
        URI childURI = this.getURI(primitiveIdContext);

        TerminalNode Identifier = ctx.Identifier();
        String identifier = Identifier.getText();

        URI uri = URI.uri2HierX(childURI,identifier);
        this.putURI(ctx,uri);
    }
}
