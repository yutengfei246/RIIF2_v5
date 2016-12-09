package it.polito.yutengfei.RIIF2.factory.RIIF2Modules;

/**
 * Created by yutengfei on 09/12/16.
 */
public class Parameter<T> extends Label<T> {

    public Parameter(String name, Boolean isAssociative, Boolean isAbstract) {
        super(name, isAssociative, isAbstract);
    }

    @Override
    public T getValue() {
        return null;
    }

    @Override
    public Boolean setValue(T value) {
        return null;
    }
}
