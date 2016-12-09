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
}
