package it.polito.yutengfei.RIIF2.parser;

import java.util.List;

/**
 * Created by yutengfei on 10/12/16.
 */
public class RowItem {
    public static final int LIST = 0;
    public static final int EXPRESSION = 1;
    private int type;
    private Expression expressionValue;

    public void setType(int type) {
        this.type = type;
    }

    public void setValue(Expression value) {
        this.expressionValue = value;
    }

    public void setValue(List<String> list) {

    }
}
