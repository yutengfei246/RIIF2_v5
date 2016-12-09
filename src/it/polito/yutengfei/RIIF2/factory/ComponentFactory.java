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
}
