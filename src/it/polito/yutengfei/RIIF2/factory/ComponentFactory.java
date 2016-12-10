package it.polito.yutengfei.RIIF2.factory;

import it.polito.yutengfei.RIIF2.factory.RIIF2Modules.Constant;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yutengfei on 09/12/16.
 */
public class ComponentFactory implements Factory {

    private static final String NO_NAME = "";
    private static final int NO_VALUE = -1;
    private static final int NO_ENTITY = 0;
    public static final int FIELD = 1;
    public static final int PARAMETER = 2;
    public static final int CONSTANT = 3;
    public static final int TYPE_ASSOCIATIVE = 20;
    public static final int TYPE_VECTOR = 21;
    public static final int BOOLEAN = 4 ;
    public static final int FLOAT = 5;
    public static final int INTEGER = 6;
    public static final int STRING = 7;
    public static final int TIME = 8;
    public static final int USER_DEFINED = 9;
    public static final int ENUM = 10;

    private String currComponentIdentifier = null;
    private List<String> eXIdentifiers = null ;
    private List<String> implIdentifiers = null;

    private Parameter parameter = null;
    private Constant constant = null;

    private int currentEntity = NO_ENTITY ;
    private int entityTypeType = NO_VALUE;
    private int entityType = NO_VALUE ;
    private String entityIdentifier = NO_NAME;
    private boolean entityIsAttribute = false;
    private Boolean entityIsAssociativeIndex = false;
    private String entityAssociativeIndexIdentifier = NO_NAME;
    private String entityTypeDefinedByUser = NO_NAME;
    private List<String> entityEnumType = null;
    private boolean entityIsList = false;
    private boolean entityIsArray = false ;
    private int entityVectorRight = NO_VALUE;
    private int entityVectorLeft = NO_VALUE;


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
            case PARAMETER:
                return this.prepareParameter();
            case CONSTANT:
                return this.prepareConstant();

        }
        return false;
    }

    private Boolean prepareConstant() throws EntityPreparedException {
        if( this.currentEntity == NO_ENTITY)
            throw new EntityPreparedException();

        this.currentEntity = CONSTANT;
        return true;
    }

    private Boolean prepareParameter() throws EntityPreparedException {
        if( this.currentEntity == NO_ENTITY)
            throw new EntityPreparedException();

        this.currentEntity = PARAMETER;
        return true;
    }

    private boolean prepareField() throws EntityPreparedException {
        return true;
    }

    public void setEntityIdentifier(String identifier) {
        this.entityIdentifier = identifier;
    }

    public void setEntityTypeType(int type) {
        this.entityTypeType = type ;
    }


    public void setEntityIsAttribute() {
        this.entityIsAttribute = true;
    }

    public void setEntityIsAssociativeIndex(String identifier) {
        this.entityIsAssociativeIndex = true;
        this.entityAssociativeIndexIdentifier = identifier;
    }

    public void setEntityType(int type) {
        this.entityType = type;
    }

    public void setEntityTypeDefinedByUser(String entityTypeDefinedByUser) {
        this.entityTypeDefinedByUser = entityTypeDefinedByUser;
    }

    public void setEntityEnumType(String entityEnumType) {
        if (this.entityEnumType == null)
            this.entityEnumType = new ArrayList<>();
        this.entityEnumType.add(entityEnumType);
    }

    public void prepareField(int fieldType) throws EntityPreparedException {

    }

    public boolean isEntityList() {
        return this.entityIsList;
    }

    public boolean isArrayEntity() {
        return this.entityIsArray;
    }

    public boolean isPrimitiveEntity() {
        return primityEntity;
    }

    public void setEntityVector(int vecLeft, int vecRight) {
        this.entityVectorLeft = vecLeft;
        this.entityVectorRight = vecRight;
    }

    public int getEntityType() {
        return entityType;
    }

    public void setEntityValue(String value ) throws EntityValueNotSuitableExpcetion{}
    public void setEntityValue(Integer value ) throws EntityValueNotSuitableExpcetion{}
    public void setEntityValue(Float value ) throws EntityValueNotSuitableExpcetion{}
    public void setEntityValue(Boolean value ) throws EntityValueNotSuitableExpcetion{}
    public void setEntityValue(Self value ) throws EntityValueNotSuitableExpcetion{}

    public static class Self {
    }
}
