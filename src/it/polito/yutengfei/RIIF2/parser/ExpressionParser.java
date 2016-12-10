package it.polito.yutengfei.RIIF2.parser;

import it.polito.yutengfei.RIIF2.RIIF2BaseListener;
import it.polito.yutengfei.RIIF2.RIIF2Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Created by yutengfei on 10/12/16.
 */
public class ExpressionParser extends RIIF2BaseListener {

    private ParseTreeProperty<Expression> expTree = new ParseTreeProperty<>();

    private final RIIF2Parser parser;

    public ExpressionParser(RIIF2Parser parser){
        this.parser = parser;
    }

    private Expression getExpression(ParseTree node){
        return this.expTree.get(node);
    }

    private void putExpression(ParseTree node , Expression expression){
        this.expTree.put(node,expression);
    }

    @Override
    public void exitLiteralString(RIIF2Parser.LiteralStringContext ctx) {
        Expression expression = new Expression();

        String value = ctx.getText();
        expression.setValue(value);

        this.putExpression(ctx,expression);
    }

    @Override
    public void exitLiteralDecimal(RIIF2Parser.LiteralDecimalContext ctx) {
        Expression expression = new Expression();

        int value = Integer.valueOf( ctx.getText() );
        expression.setValue(value);

        this.putExpression(ctx,expression);
    }

    @Override
    public void exitLiteralFloatingPoint(RIIF2Parser.LiteralFloatingPointContext ctx) {
        Expression expression = new Expression();

        float value = Float.valueOf( ctx.getText() );
        expression.setValue(value);

        this.putExpression(ctx,expression);
    }

    @Override
    public void exitPrimaryLiteral(RIIF2Parser.PrimaryLiteralContext ctx) {
        Expression expression = this.getExpression(ctx.literal());
        this.putExpression(ctx,expression);
    }

    @Override
    public void exitPrimaryParentheses(RIIF2Parser.PrimaryParenthesesContext ctx) {
        //TODO: expression has to store in EXP-TREE
        Expression expression = this.getExpression(ctx.expression());
        this.putExpression(ctx,expression);
    }

    @Override
    public void exitPrimaryFalse(RIIF2Parser.PrimaryFalseContext ctx) {
        Expression expression = new Expression();
        expression.setType(Expression.BOOLEAN);
        expression.setValue(false);
        this.putExpression(ctx,expression);
    }

    @Override
    public void exitPrimaryTrue(RIIF2Parser.PrimaryTrueContext ctx) {
        Expression expression = new Expression();
        expression.setType(Expression.BOOLEAN);
        expression.setValue(true);
        this.putExpression(ctx,expression);
    }

    @Override
    public void exitPrimarySelf(RIIF2Parser.PrimarySelfContext ctx) {
        Expression expression = new Expression();
        expression.setType(Expression.SELF);
        this.putExpression(ctx,expression);
    }

    @Override
    public void exitPrimaryFuncCall(RIIF2Parser.PrimaryFuncCallContext ctx) {
        //TODO: function call has to store in EXP-TREE
        Expression expression = this.getExpression(ctx.funcCall());
        this.putExpression(ctx,expression);
    }

    @Override
    public void exitPrimaryAIS(RIIF2Parser.PrimaryAISContext ctx) {
        //TODO: aisID has to be stored into EXP-TREE
        Expression expression = this.getExpression(ctx.aisDeclaratorId());
        this.putExpression(ctx,expression);
    }

    @Override
    public void exitPrimaryArrayInitializer(RIIF2Parser.PrimaryArrayInitializerContext ctx) {
        //TODO: arrayInitializer has to be stored into EXP-TREE
        Expression expression = this.getExpression(ctx.arrayInitializer());
        this.putExpression(ctx,expression);
    }

    @Override
    public void exitExpPrimary(RIIF2Parser.ExpPrimaryContext ctx) {
        Expression expression = this.getExpression(ctx.primary());
        this.putExpression(ctx,expression);
    }

    @Override
    public void exitExpPositiveOrNegative(RIIF2Parser.ExpPositiveOrNegativeContext ctx) {
        Expression expression = this.getExpression(ctx.expression());
        if (ctx.op.getType() == RIIF2Parser.T__15){
            expression.operation(Expression.OP_NEGATIVE);
        }

        if ( ctx.op.getType() == RIIF2Parser.T__14){
            expression.operation(Expression.OP_POSITIVE);
        }

        this.putExpression(ctx,expression);
    }

    @Override
    public void exitExpWaveOrNot(RIIF2Parser.ExpWaveOrNotContext ctx) {
        Expression expression = this.getExpression(ctx.expression());
        if (ctx.op.getType() == RIIF2Parser.T__16){
            expression.operation(Expression.OP_WAVE);
        }

        if ( ctx.op.getType() == RIIF2Parser.T__17){
            expression.operation(Expression.OP_NOT);
        }

        this.putExpression(ctx,expression);
    }

    @Override
    public void exitExpStarOrDivOrMod(RIIF2Parser.ExpStarOrDivOrModContext ctx) {
        Expression leftExp = this.getExpression(ctx.expression(0));
        Expression rightExp = this.getExpression(ctx.expression(1));

        Expression expression = null ;
        try {
            if (ctx.op.getType() == RIIF2Parser.T__18) {
                expression = leftExp.operation(Expression.OP_STAR, rightExp);
                return;
            }

            if (ctx.op.getType() == RIIF2Parser.T__19) {
                expression = leftExp.operation(Expression.OP_DIV, rightExp);
                return;
            }

            if (ctx.op.getType() == RIIF2Parser.T__20) {
                expression = leftExp.operation(Expression.OP_MOD, rightExp);
            }
        }finally {
            this.putExpression(ctx,expression);
        }
    }

    @Override
    public void exitExpMinusOrPlus(RIIF2Parser.ExpMinusOrPlusContext ctx) {
        Expression leftExp = this.getExpression(ctx.expression(0));
        Expression rightExp = this.getExpression(ctx.expression(1));

        Expression expression = null;
        try {
            if (ctx.op.getType() == RIIF2Parser.T__15) {
                expression = leftExp.operation(Expression.OP_MINUS, rightExp);
                return;
            }

            if (ctx.op.getType() == RIIF2Parser.T__14) {
                expression = leftExp.operation(Expression.OP_PLUS, rightExp);
            }
        }finally {
            this.putExpression(ctx,expression);
        }
    }

    @Override
    public void exitExpCmp(RIIF2Parser.ExpCmpContext ctx) {
        Expression leftExp = this.getExpression(ctx.expression(0));
        Expression rightExp = this.getExpression(ctx.expression(1));

        Expression expression = null;
        try {
            if (ctx.op.getType() == RIIF2Parser.T__21) {
                expression = leftExp.operation(Expression.OP_SM_EQ, rightExp);
                return;
            }
            if (ctx.op.getType() == RIIF2Parser.T__22) {
                expression = leftExp.operation(Expression.OP_BG_EQ, rightExp);
                return;
            }
            if (ctx.op.getType() == RIIF2Parser.T__5) {
                expression = leftExp.operation(Expression.OP_BG, rightExp);
                return;
            }
            if (ctx.op.getType() == RIIF2Parser.T__4) {
                expression = leftExp.operation(Expression.OP_SM, rightExp);
            }
        }finally {
            this.putExpression(ctx,expression);
        }
    }

    @Override
    public void exitExpEqOrNotEq(RIIF2Parser.ExpEqOrNotEqContext ctx) {
        Expression leftExp = this.getExpression(ctx.expression(0));
        Expression rightExp = this.getExpression(ctx.expression(1));

        Expression expression = null;
        try {
            if (ctx.op.getType() == RIIF2Parser.T__23) {
                expression = leftExp.operation(Expression.OP_EQ_EQ, rightExp);
                return;
            }
            if (ctx.op.getType() == RIIF2Parser.T__24) {
                expression = leftExp.operation(Expression.OP_NOT_EQ, rightExp);
            }
        }finally {
            this.putExpression(ctx,expression);
        }
    }

    @Override
    public void exitExpSingleAnd(RIIF2Parser.ExpSingleAndContext ctx) {
        Expression leftExp = this.getExpression(ctx.expression(0));
        Expression rightExp = this.getExpression(ctx.expression(1));

        Expression expression = null;
        try {
            if (ctx.op.getType() == RIIF2Parser.T__25) {
                expression = leftExp.operation(Expression.OP_SINGLE_AND, rightExp);
            }
        }finally {
            this.putExpression(ctx,expression);
        }
    }

    @Override
    public void exitExpSingleOr(RIIF2Parser.ExpSingleOrContext ctx) {
        Expression leftExp = this.getExpression(ctx.expression(0));
        Expression rightExp = this.getExpression(ctx.expression(1));

        Expression expression = null;
        try {
            if (ctx.op.getType() == RIIF2Parser.T__27) {
                expression = leftExp.operation(Expression.OP_SINGLE_OR, rightExp);
            }

        }finally {
            this.putExpression(ctx,expression);
        }
    }

    
}

