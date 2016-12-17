package it.polito.yutengfei.RIIF2.factory.utility;

import it.polito.yutengfei.RIIF2.parser.utilityWrapper.ArrayItem;
import it.polito.yutengfei.RIIF2.parser.utilityWrapper.Expression;

import java.util.List;
import java.util.Objects;

public class FieldFactory {

    private int fieldType;

    private boolean attribute;
    private boolean associativeInstance;

    private String identifier;
    private String attributeIndex;
    private String associativeIndex;
    private String type;
    private String typeUserType;
    private List<String> enumList;

    private int vecLeft = -1;
    private int vecRight = -1;
    private int initializerType = -1;
    private int typeType = -1;

    private Object initializer;

    public void setFieldType(int fieldType) {
        this.fieldType = fieldType;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setTypeUserType(String typeUserType) {
        this.typeUserType = typeUserType;
    }

    public void setEnumList(List<String> enumList) {
        this.enumList = enumList;
    }

    public void setInitializerType(int initializerType) {
        this.initializerType = initializerType;
    }

    public void setInitializer(Object initializer) {
        this.initializer = initializer;
    }

    public void setTypeType(int typeType) {
        this.typeType = typeType;
    }

    public String getType() {
        return type;
    }

    public int getFieldType() {
        return fieldType;
    }

    public int getTypeType() {
        return typeType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getVecLeft() {
        return vecLeft;
    }

    public int getVecRight() {
        return vecRight;
    }

    public int getInitializerType() {
        return initializerType;
    }

    public List<String> getEnumList() {
        return enumList;
    }

    public Object getInitializer() {
        return initializer;
    }

    public void setVector(int vecLeft, int vecRight) {
        this.vecLeft = vecLeft;
        this.vecRight = vecRight;
    }

    public StringBuffer getJavaFieldLine(){

        if( this.getTypeType() == RIIF2Grammar.TYPE_TYPE_ASSOCIATIVE /*Map<String,type>*/)
            return createMapField();


        if( this.getTypeType() == RIIF2Grammar.TYPE_TYPE_VECTOR /*String[][] */ )
            return createVectorField();

        return createNormalField();

    }

    private StringBuffer createVectorField() {
        StringBuffer vectorFieldLine = new StringBuffer();

        vectorFieldLine.append("\tprivate ");

        if( this.getFieldType() == RIIF2Grammar.CONSTANT)
            vectorFieldLine.append("final ");

        vectorFieldLine.append(this.getType());
        vectorFieldLine.append("[ ]");

        if( this.getVecLeft() > 1)
            vectorFieldLine.append("[ ] ");
        vectorFieldLine.append(this.getIdentifier());

        if( this.getInitializerType() == -1 ){
            vectorFieldLine.append("[").append(this.getVecLeft()).append("]");
            vectorFieldLine.append("[").append(this.getVecRight()).append("] ");
        }

        if( this.getInitializerType() != -1 &&
                this.getInitializerType() != RIIF2Grammar.ARRAY_INITIALIZER){
            //TODO:Exception
        }else{
            vectorFieldLine.append("= new ").append(this.getType());
            vectorFieldLine.append("[ ]");
            vectorFieldLine.append("[ ] ");

            vectorFieldLine.append("{ ");
            int vecL = this.getVecLeft();
            int vecR = this.getVecRight();

            List< List<ArrayItem> > arrayWrapper
                    = (List<List<ArrayItem>>) this.getInitializer();

            if(arrayWrapper.size() != vecL ){
                //TODO:Exception
            }else{
                int i = 0;
                for (List<ArrayItem> arrayItems : arrayWrapper){
                    i++;
                    vectorFieldLine.append("{");
                    if (arrayItems.size() != vecR ){
                        //TODO:Exception
                    }else{
                        int j = 0;
                        for (ArrayItem arrayItem : arrayItems){
                            j++;
                            Expression expression = arrayItem.getItem();
                            if(!expression.getType().equals(this.getType())){
                                //TODO: Exception
                            }else{
                                vectorFieldLine.append(expression.getValue().toString());
                            }
                            if( j < vecR)
                                vectorFieldLine.append(",");
                        }
                    }
                    vectorFieldLine.append("}");
                    if( i < vecL)
                        vectorFieldLine.append(",");
                }
            }

            vectorFieldLine.append(" }; \r\n ");
        }

        return vectorFieldLine;
    }

    private StringBuffer createMapField() {
        StringBuffer mapFieldLine = new StringBuffer();

        mapFieldLine.append("\tprivate ");

        if (this.getFieldType() == RIIF2Grammar.CONSTANT)
            mapFieldLine.append("final ");

        String valueType = this.getType();

        mapFieldLine.append("Map<String,").append(valueType).append(">").append(" ");
        mapFieldLine.append(this.getIdentifier());

        if (this.getInitializerType() != -1 &&
                this.getInitializerType() != RIIF2Grammar.LIST_INITIALIZER) {
            //TODO: exception
        } else {
            mapFieldLine.append("= new HashMap<String,").append(valueType).append(">() {{ ");
            List<String> keys = (List<String>) this.getInitializer();
            for (String key : keys){
                mapFieldLine.append("put(\"").append(key).append("\",").append("null);");
            }

            mapFieldLine.append("}}");
        }

        mapFieldLine.append(";\r\n");

        return mapFieldLine;
    }

    private StringBuffer createNormalField() {
        StringBuffer normalFieldLine = new StringBuffer();

        normalFieldLine.append("\tprivate ");

        if( this.getFieldType() == RIIF2Grammar.CONSTANT )
            normalFieldLine.append("final ");

        normalFieldLine.append(this.getType()).append(" ");
        normalFieldLine.append(this.getIdentifier());

        if (this.getInitializerType() != -1 &&
                this.getInitializerType() != RIIF2Grammar.EXPRESSION){//TODO: exception
        }else{
            normalFieldLine.append("=");
            Expression expression = (Expression) this.initializer;
            if(!Objects.equals(expression.getType(), this.getType())){
                //TODO: exception
            }else{
                normalFieldLine.append( expression.getValue().toString() );
            }
        }

        normalFieldLine.append(";\r\n");

        return normalFieldLine;
    }
}
