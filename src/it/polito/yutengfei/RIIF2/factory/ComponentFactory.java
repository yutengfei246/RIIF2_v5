package it.polito.yutengfei.RIIF2.factory;

import it.polito.yutengfei.RIIF2.factory.RIIF2Modules.Component;
import it.polito.yutengfei.RIIF2.factory.utility.FieldFactory;
import it.polito.yutengfei.RIIF2.factory.utility.RIIF2Grammar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yutengfei on 09/12/16.
 */
public class ComponentFactory implements Factory {

    private static int NO_ENTITY = -1;
    FileWriter writer;

    // the component
    private Component component = null;

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
        this.component = new Component();
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
            case RIIF2Grammar.FIELD:
                return this.prepareField();
        }
        return false;
    }

    private boolean prepareField() throws EntityPreparedException {
        if( this.currentEntity != NO_ENTITY)
            throw new EntityPreparedException();

        this.currentEntity = RIIF2Grammar.FIELD;
        this.fieldFactory = new FieldFactory();

        return true;
    }

    public void prepareField(int fieldType) throws EntityPreparedException {

        switch (fieldType){
            case RIIF2Grammar.PARAMETER:
                this.prepareParameter();
                break;
            case RIIF2Grammar.CONSTANT:
                this.prepareConstant();
                break;
            default:
                break;
        }
    }

    private Boolean prepareConstant() throws EntityPreparedException {
        if( this.currentEntity != RIIF2Grammar.FIELD)
            throw new EntityPreparedException();

        this.fieldFactory.setFieldType( RIIF2Grammar.CONSTANT );
        return true;
    }

    private Boolean prepareParameter() throws EntityPreparedException {
        if( this.currentEntity != RIIF2Grammar.FIELD)
            throw new EntityPreparedException();

        this.fieldFactory.setFieldType( RIIF2Grammar.PARAMETER );
        return true;
    }

    public void setEntityIdentifier(String identifier) {

        if( this.currentEntity == RIIF2Grammar.FIELD)
            this.fieldFactory.setIdentifier( identifier );
    }

    public void setEntityTypeType(int type) {

        if( this.currentEntity == RIIF2Grammar.FIELD){
            this.fieldFactory.setTypeType(type);
        }
    }

    public void setEntityIsAttribute() {

        if( this.currentEntity == RIIF2Grammar.FIELD){
            this.fieldFactory.setAttribute(true);
        }
    }

    public void setEntityAttributeIndex(String attributeIndex){

        this.setEntityIsAttribute();
        if( this.currentEntity == RIIF2Grammar.FIELD ){
            this.fieldFactory.setAttributeIndex( attributeIndex );
        }
    }

    public void setEntityIsAssociativeInstance(){

        if( this.currentEntity == RIIF2Grammar.FIELD)
            this.fieldFactory.setAssociativeInstance(true);
    }

    public void setEntityAssociativeIndex(String identifier) {

        this.setEntityIsAssociativeInstance();
        if( this.currentEntity == RIIF2Grammar.FIELD)
            this.fieldFactory.setAssociativeIndex( identifier );
    }

    public void setEntityType(String type) {

        if( this.currentEntity == RIIF2Grammar.FIELD )
            this.fieldFactory.setType(type);
    }

    public void setEntityTypeDefinedByUser(String entityTypeDefinedByUser) {

        if( this.currentEntity == RIIF2Grammar.FIELD)
            this.fieldFactory.setTypeUserType(entityTypeDefinedByUser);
    }

    public void setEntityEnumType(String entityEnum) {

        if (this.currentEntity == RIIF2Grammar.FIELD) {
            List<String> enumList = this.fieldFactory.getEnumList();
            enumList.add(entityEnum);
        }
    }

    public void setEntityVector(int vecLeft, int vecRight) {

        if( this.currentEntity == RIIF2Grammar.FIELD)
            this.fieldFactory.setVector(vecLeft,vecRight);
    }

    public void setEntityInitializerType(int initializerType) {

        if( this.currentEntity == RIIF2Grammar.FIELD)
            this.fieldFactory.setInitializerType( initializerType );
    }

    public void setEntityInitializer(Object entityInitializer) {

        if( this.currentEntity == RIIF2Grammar.FIELD)
            this.fieldFactory.setInitializer( entityInitializer );

    }

    public void assembleEntity() {

        if( this.currentEntity == RIIF2Grammar.FIELD)
            this.component.add(this.fieldFactory);
    }

    public void cleanEntity() {

        if( this.currentEntity == RIIF2Grammar.FIELD) {
            this.currentEntity = NO_ENTITY;
            this.fieldFactory = null;
        }
    }

    public void commit() {
        this.component.setIdentifier( this.currComponentIdentifier );
        this.component.setImplemented( this.implIdentifiers );
        this.component.setExtended( this.eXIdentifiers );
    }

    public void productComponent() {

        this.component.print();

        try {
            String identifier = this.component.getIdentifier();
            String fileName = identifier + ".java";
            this.writer = new FileWriter( new File( fileName ));
            this.writer.write(this.component.getImports());
            this.writer.write(String.valueOf(this.component.getClassIdentifier()));
            this.writer.write(String.valueOf(this.component.getExts()));
            this.writer.write(String.valueOf(this.component.getImpls()));
            this.writer.write(String.valueOf(this.component.getField()));
            this.writer.write(this.component.getEnd());
            this.writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }

    }

    public static class Self {
    }
}
