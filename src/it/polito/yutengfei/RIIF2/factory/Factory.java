package it.polito.yutengfei.RIIF2.factory;

/**
 * Created by yutengfei on 09/12/16.
 */
public interface Factory {
    static ComponentFactory newComponentFactory() {
        return new ComponentFactory();
    }
}
