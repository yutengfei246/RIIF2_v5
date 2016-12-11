package it.polito.yutengfei.RIIF2.factory;

import it.polito.yutengfei.RIIF2.parser.utilityWrapper.Expression;

import java.util.List;

/**
 * Created by yutengfei on 10/12/16.
 */
public class ArrayItem {
    private Expression item;

    public void setItem(Expression item) {
        this.item = item;
    }

    public void setItem(String item) {

    }

    public void setItem(List<ArrayItem> previousArrayInitializer) {

    }
}
