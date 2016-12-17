package it.polito.yutengfei.RIIF2.factory;

import it.polito.yutengfei.RIIF2.factory.RIIF2Modules.Constant;
import it.polito.yutengfei.RIIF2.factory.utility.FieldFactory;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yutengfei on 09/12/16.
 */
public class ComponentFactory implements Factory {

    private static final int NO_ENTITY = 0;

    public static final int FIELD = 1;
    public static final int PARAMETER = 2;
    public static final int CONSTANT = 3;
    public static final int BOOLEAN = 4 ;
    public static final int FLOAT = 5;
    public static final int INTEGER = 6;
    public static final int STRING = 7;
    public static final int TIME = 8;
    public static final int USER_DEFINED = 9;
    public static final int ENUM = 10;

    public static final int TYPE_ASSOCIATIVE = 20;
    public static final int TYPE_VECTOR = 21;
    public static final int LIST_INITIALIZER = 30;
    public static final int ARRAY_INITIALIZER = 31;
    public static final int EXPRESSION = 32;

    // component entity

    // component name :
    private String currComponentIdentifier = null;
    // component extends class :
    private List<String> eXIdentifiers = null ;
    // component implemented class :
    private List<String> implIdentifiers = null;

    // prepared value

    // specify current entity type:  parameter constant fail:mode child:mode
    private int currentEntity = NO_ENTITY;

    private FieldFactory fieldFactory = null;


    //initialization: tell the component start to prepare component with no name
    public void start() {
        this.start("");
    }

    public void start(String name ) {
        this.currComponentIdentifier = name;
    }

    public void setCurrentComponentIdentifier(String identifier) {
        this.currComponentIdentifier = identifier;
    }

    public void setCurrentComponentExtendsIdentifier(String identifier) {
        if(this.eXIdentifiers == null)
            this.eXIdentifiers = new ArrayList<>();

        this.eXIdentifiers.add(identifier);
    }

    public void setCurrentComponentImplementsIdentifier(String identifier) {
        if(this.implIdentifiers == null)
            this.implIdentifiers = new ArrayList<>();

        this.implIdentifiers.add(identifier);
    }

    public Boolean prepare(int key) throws EntityPreparedException {
        switch(key){
            case FIELD:
                return this.prepareField();

        }
        return false;
    }

    private Boolean prepareConstant() throws EntityPreparedException {
        if( this.currentEntity != FIELD)
            throw new EntityPreparedException();

        this.fieldFactory.setFieldType( CONSTANT );
        return true;
    }

    private Boolean prepareParameter() throws EntityPreparedException {
        if( this.currentEntity != FIELD)
            throw new EntityPreparedException();

        this.fieldFactory.setFieldType( PARAMETER );
        return true;
    }

    private boolean prepareField() throws EntityPreparedException {
        if( this.currentEntity != NO_ENTITY)
            throw new EntityPreparedException();

        this.currentEntity = FIELD;
        this.fieldFactory = new FieldFactory();

        return true;
    }

    public void setEntityIdentifier(String identifier) {

        if( this.currentEntity == FIELD)
            this.fieldFactory.setIdentifier( identifier );
    }

    public void setEntityTypeType(int type) {

        if( this.currentEntity == FIELD){
            this.fieldFactory.setTypeTpye(type);
        }
    }

    public void setEntityIsAttribute() {

        if( this.currentEntity == FIELD){
            this.fieldFactory.setAttribute(true);
        }
    }

    public void setEntityAttributeIndex(String attributeIndex){

        this.setEntityIsAttribute();
        if( this.currentEntity == FIELD ){
            this.fieldFactory.setAttributeIndex( attributeIndex );
        }
    }

    public void setEntityIsAssociativeInstance(){

        if( this.currentEntity == FIELD)
            this.fieldFactory.setAssociativeInstance(true);
    }

    public void setEntityAssociativeIndex(String identifier) {

        this.setEntityIsAssociativeInstance();
        if( this.currentEntity == FIELD)
            this.fieldFactory.setAssociativeIndex( identifier );
    }

    public void setEntityType(int type) {

        if( this.currentEntity == FIELD )
            this.fieldFactory.setType(type);
    }

    public void setEntityTypeDefinedByUser(String entityTypeDefinedByUser) {

        if( this.currentEntity == FIELD)
            this.fieldFactory.setTypeUserType(entityTypeDefinedByUser);
    }

    public void setEntityEnumType(String entityEnum) {

        if (this.currentEntity == FIELD) {
            List<String> enumList = this.fieldFactory.getEnumList();
            enumList.add(entityEnum);
        }
    }

    public void prepareField(int fieldType) throws EntityPreparedException {

        switch (fieldType){
            case PARAMETER:
                this.prepareParameter();
            case CONSTANT:
                this.prepareConstant();
        }
    }

    public boolean isEntityList() {

        if( this.currentEntity == FIELD)
            return this.fieldFactory.isList();

        return false;
    }

    public boolean isArrayEntity() {

        if( this.currentEntity == FIELD)
            return this.fieldFactory.isArray();

        return false;
    }


    public boolean isPrimitiveEntity() {

        if( this.currentEntity == FIELD)
            return this.fieldFactory.isPrimitiveType();

        return false;
    }

    public void setEntityVector(int vecLeft, int vecRight) {

        if( this.currentEntity == FIELD)
            this.fieldFactory.setVector(vecLeft,vecRight);
    }

    public void setEntityValue(String value ) throws EntityValueNotSuitableExpcetion{}
    public void setEntityValue(Integer value ) throws EntityValueNotSuitableExpcetion{}
    public void setEntityValue(Float value ) throws EntityValueNotSuitableExpcetion{}
    public void setEntityValue(Boolean value ) throws EntityValueNotSuitableExpcetion{}
    public void setEntityValue(Self value ) throws EntityValueNotSuitableExpcetion{}

    public void setEntityInitializerType(int initializer) {

        if( this.currentEntity == FIELD)
            this.fieldFactory.setInitializerType( initializer );
    }

    public void setEntityInitializer(Object entityInitializer) {

    }

    public static class Self {
    }
}
