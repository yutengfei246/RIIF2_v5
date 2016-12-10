package it.polito.yutengfei.RIIF2.parser;

/**
 * Created by yutengfei on 09/12/16.
 */
public class Expression {
    public static final int STRING = 1;
    public static final int INTEGER = 2;
    public static final int FLOAT = 3;
    public static final int BOOLEAN = 4;
    public static final int SELF = 5;

    public static final int OP_NEGATIVE = 11;
    public static final int OP_POSITIVE = 12;
    public static final int OP_WAVE = 13;
    public static final int OP_NOT = 14;
    public static final int OP_STAR = 15;
    public static final int OP_DIV = 16;
    public static final int OP_MOD = 17;
    public static final int OP_PLUS = 18;
    public static final int OP_MINUS = 19;
    public static final int OP_SM_EQ = 20;
    public static final int OP_BG_EQ = 21;
    public static final int OP_EQ_EQ = 22;
    public static final int OP_NOT_EQ = 23;
    public static final int OP_BG = 24;
    public static final int OP_SM = 25;
    public static final int OP_SINGLE_AND = 26;
    public static final int OP_SINGLE_OR = 27;
    public static final int OP_SINGLE_POWER = 28;
    public static final int OP_DOUBLE_AND = 29;
    public static final int OP_DOUBLE_OR = 30;
    public static final int OP_ASSIGN = 31;
    public static final int OP_IF_ELSE = 32;
    private int type;
    private String stringValue;
    private int intValue;
    private float floatValue;
    private boolean booleanValue;

    public void setType(int type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.stringValue = value;
    }

    public void setValue(int value) {
        this.intValue= value;
    }

    public void setValue(float value) {
        this.floatValue = value;
    }

    public void setValue(boolean value) {
        this.booleanValue = value;
    }

    public void operation(int opration) {

    }

    public Expression operation(int opr, Expression rightExp) {

        return null;
    }

    public Expression operation(int opIfElse, Expression middleExp, Expression rightExp) {
        return null;
    }

    public boolean isInteger() {
        return null;
    }

    public Object getValue() {

        return null;
    }
}
