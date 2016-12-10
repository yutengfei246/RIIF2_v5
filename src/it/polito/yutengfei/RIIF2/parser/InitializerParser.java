package it.polito.yutengfei.RIIF2.parser;

import it.polito.yutengfei.RIIF2.RIIF2Parser;
import it.polito.yutengfei.RIIF2.factory.ArrayItem;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class InitializerParser extends ExpressionParser {

    private ParseTreeProperty<String> listItemTree = new ParseTreeProperty<>();
    private List<String> listInitializer = null;

    private void putListItemString(ParseTree node, String value ){
        this.listItemTree.put(node,value);
    }

    private String getListItemString(ParseTree node){
        return this.listItemTree.get(node);
    }

    public List<String> getListInitializer(){
        List<String> returnedList = this.listInitializer;
        this.cleanListInitializer();
        return returnedList;
    }

    private void cleanListInitializer(){
        this.listItemTree = new ParseTreeProperty<>();
        this.listItemTree = null;
    }

    public InitializerParser(RIIF2Parser parser) {
        super(parser);
    }



    // list initializer parser

    @Override
    public void exitListItemDecimalLiteral(RIIF2Parser.ListItemDecimalLiteralContext ctx) {
        TerminalNode DecimalToken = ctx.DecimalLiteral();
        String decimalToken = DecimalToken.getText();

        this.putListItemString(ctx,decimalToken);
    }

    @Override
    public void exitListItemFloatingPointLiteral(RIIF2Parser.ListItemFloatingPointLiteralContext ctx) {
        TerminalNode FloatingPointToken = ctx.FloatingPointLiteral();
        String floatingPointToken = FloatingPointToken.getText();

        this.putListItemString(ctx,floatingPointToken);
    }

    @Override
    public void exitListItemIdentifier(RIIF2Parser.ListItemIdentifierContext ctx) {
        TerminalNode TextToken = ctx.Identifier();
        String textToken = TextToken.getText();

        this.putListItemString(ctx,textToken);
    }

    @Override
    public void exitListInitializer(RIIF2Parser.ListInitializerContext ctx) {
        List<RIIF2Parser.ListItemContext> listItemContexts
                = ctx.listItem();

        List<String> currentListInitializer = new ArrayList<>();
        for (RIIF2Parser.ListItemContext listItemContext : listItemContexts){
            String listItem = this.getListItemString(listItemContext);
            currentListInitializer.add(listItem);
        }
        this.listInitializer = currentListInitializer;
    }

    // array initializer parser

    private ParseTreeProperty<ArrayItem> arrayItemTree = new ParseTreeProperty<>();
    private List<ArrayItem> arrayInitializer = null;

    public List<ArrayItem> getArrayInitializer(){
        List<ArrayItem> returnedList = this.arrayInitializer;
        this.cleanArrayInitializer();
        return returnedList;
    }

    private void cleanArrayInitializer(){
        this.arrayInitializer = null;
        this.arrayItemTree = new ParseTreeProperty<>();
    }

    private void putArrayItem(ParseTree node , ArrayItem value){
        this.arrayItemTree.put(node,value);
    }

    private ArrayItem getArrayItem(ParseTree node){
        return this.arrayItemTree.get(node);
    }

    @Override
    public void exitArrayItem(RIIF2Parser.ArrayItemContext ctx) {
        RIIF2Parser.ExpressionContext expressionContext
                = ctx.expression();

        Expression expression = super.getExpression(expressionContext);

        ArrayItem arrayItem = new ArrayItem();
        arrayItem.setItem(expression);

        this.putArrayItem(ctx,arrayItem);
    }

    @Override
    public void exitArrayInitializer(RIIF2Parser.ArrayInitializerContext ctx) {
        List<RIIF2Parser.ArrayItemContext> arrayItemContexts
            = ctx.arrayItem();

        List<ArrayItem> currentArrayInitializer = new ArrayList<>();
        for (RIIF2Parser.ArrayItemContext arrayItemContext : arrayItemContexts){
            ArrayItem arrayItem = this.getArrayItem(arrayItemContext);
            currentArrayInitializer.add(arrayItem);
        }

        this.arrayInitializer = currentArrayInitializer;

        ParserRuleContext parentContext = ctx.getParent();
        if(parentContext instanceof RIIF2Parser.PrimaryContext){
            Expression expression = new Expression();
            expression.setType(Expression.ARRAY);
            expression.setValue(this.getArrayInitializer());
            super.putExpression(ctx,expression);
        }
    }

    //table Item Initializer

    private ParseTreeProperty<Row> rowParseTreeProperty = new ParseTreeProperty<>();
    private ParseTreeProperty<RowItem> rowItemParseTreeProperty = new ParseTreeProperty<>();


    public void putRowParseTree(ParseTree node , Row value ){
        this.rowParseTreeProperty.put(node,value);
    }

    public Row getRowParseTree(ParseTree node ){
        return this.rowParseTreeProperty.get(node );
    }

    public void putRowItemParseTree(ParseTree node ,RowItem value){
        this.rowItemParseTreeProperty.put(node,value);
    }

    public RowItem getRowItemParseTree(ParseTree node){
        return this.rowItemParseTreeProperty.get(node );
    }


    @Override
    public void exitRowExpression(RIIF2Parser.RowExpressionContext ctx) {
        RIIF2Parser.ExpressionContext expressionContext
                = ctx.expression();

        Expression expression = super.getExpression(expressionContext);

        Row row = new Row();
        row.setType(Row.EXPRESSION);
        row.setValue(expression);

        if (row.getPrimitiveType() != Expression.ARRAY){
            //TODO: exception
        }else{
            this.putRowParseTree(ctx,row);
        }

        // in this case, row has to be array
    }

    @Override
    public void exitRowItemExpression(RIIF2Parser.RowItemExpressionContext ctx) {
        RIIF2Parser.ExpressionContext expressionContext
                = ctx.expression();

        Expression expression = super.getExpression(expressionContext);

        RowItem rowItem = new RowItem();
        rowItem.setType(RowItem.EXPRESSION);
        rowItem.setValue(expression);

        this.putRowItemParseTree(ctx,rowItem);
    }

    @Override
    public void exitRowItemListInitializer(RIIF2Parser.RowItemListInitializerContext ctx) {
        List<String> list = this.getListInitializer();

        RowItem rowItem = new RowItem();
        rowItem.setType(RowItem.LIST);
        rowItem.setValue(list);

        this.putRowItemParseTree(ctx,rowItem);
    }

    @Override
    public void exitRowArray(RIIF2Parser.RowArrayContext ctx) {
        List<RIIF2Parser.RowItemContext> rowItemContexts
                = ctx.rowItem();

        List<RowItem> rowItems = new ArrayList<>();
        for (RIIF2Parser.RowItemContext rowItemContext : rowItemContexts){
            RowItem rowItem = this.getRowItemParseTree(rowItemContext);
            rowItems.add(rowItem);
        }

        Row row = new Row();
        row.setType(Row.ROW_ITEM);
        row.setValue(rowItems);

        this.putRowParseTree(ctx,row);
    }

    @Override
    public void exitTableItemInitializer(RIIF2Parser.TableItemInitializerContext ctx) {
        List<RIIF2Parser.RowContext> rowContexts
                = ctx.row();

        for (RIIF2Parser.RowContext rowContext : rowContexts){
            //TODO: here
        }
    }
}
