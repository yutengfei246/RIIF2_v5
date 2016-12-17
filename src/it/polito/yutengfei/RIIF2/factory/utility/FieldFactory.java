package it.polito.yutengfei.RIIF2.factory.utility;

import it.polito.yutengfei.RIIF2.factory.ComponentFactory;
import it.polito.yutengfei.RIIF2.factory.RIIF2Modules.Constant;

import java.lang.reflect.Parameter;
import java.util.List;

/**
 * Created by yutengfei on 11/12/16.
 */
public class FieldFactory {
    // field entity

    // parameter:
    private Parameter parameter = null;

    // constant:
    private Constant constant = null;


    private int fieldType;
    private String identifier;
    private int typeTpye;
    private boolean attribute;
    private String attributeIndex;
    private boolean associativeInstance;
    private String associativeIndex;
    private int type;
    private String typeUserType;
    private List<String> enumList;
    private boolean list;
    private boolean array;
    private int vecLeft;
    private int vecRight;
    private int initializerType;

    public void setFieldType(int fieldType) {
        this.fieldType = fieldType;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setTypeTpye(int typeTpye) {
        this.typeTpye = typeTpye;
    }

    public void setAttribute(boolean attribute) {
        this.attribute = attribute;
    }

    public void setAttributeIndex(String attributeIndex) {
        this.attributeIndex = attributeIndex;
    }

    public void setAssociativeIndex(String identifier) {
        this.associativeIndex = identifier;
    }

    public void setAssociativeInstance(boolean associativeInstance) {
        this.associativeInstance = associativeInstance;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setTypeUserType(String typeUserType) {
        this.typeUserType = typeUserType;
    }

    public List<String> getEnumList() {
        return enumList;
    }

    public void setEnumList(List<String> enumList) {
        this.enumList = enumList;
    }

    public boolean isList() {
        return list;
    }

    public void setList(boolean list) {
        this.list = list;
    }

    public boolean isArray() {
        return array;
    }

    public void setArray(boolean array) {
        this.array = array;
    }

    public boolean isPrimitiveType() {
        if (this.getType() == ComponentFactory.INTEGER || this.getType() == ComponentFactory.FLOAT)
            return true;
        return false;
    }

    public int getType() {
        return type;
    }

    public void setVector(int vecLeft, int vecRight) {
        this.vecLeft = vecLeft;
        this.vecRight = vecRight;
    }

    public void setInitializerType(int initializerType) {
        this.initializerType = initializerType;
    }
}
