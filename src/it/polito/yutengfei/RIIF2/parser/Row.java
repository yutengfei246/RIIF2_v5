package it.polito.yutengfei.RIIF2.parser;

import java.util.List;

/**
 * Created by yutengfei on 10/12/16.
 */
public class Row {


    public static final int EXPRESSION = 1;
    public static final int ROW_ITEM = 2;
    private int type;
    private Expression expressionValue;

    public void setType(int type) {
        this.type = type;
    }

    public void setValue(Expression value) {
        this.expressionValue = value;
    }

    public int getPrimitiveType() {

        return  0;
    }

    public void setValue(List<RowItem> rowItems) {

    }
}
