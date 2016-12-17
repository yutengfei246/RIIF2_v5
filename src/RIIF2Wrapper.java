import java.util.ArrayList;
import java.util.List;

public class RIIF2Wrapper {

    public static final String TYPE_INTEGER = "Integer";
    public static final String TYPE_STRING = "String";
    public static final String TYPE_DOUBLE = "Double";
    public static final String TYPE_ARRAY = "Array";
    public static final String TYPE_LIST = "List";
    public static final String TYPE_TABLE = "Table";

    private Object value;
    private String identifier;
    private String type;

    private int vecLet;
    private int vecRight;

    public RIIF2Wrapper(){}

    public void wrapInteger(String identifier, Integer value){
        this.type = TYPE_INTEGER;
        this.identifier = identifier;
        this.value = value;
    }

    public void wrapDouble(String identifier, Double value ){
        this.type = TYPE_DOUBLE;
        this.identifier = identifier;
        this.value = value;
    }

    public void wrapString(String identifier, String value){
        this.type = TYPE_STRING;
        this.identifier = identifier;
        this.value = value;
    }

    //TODO: tomorrow
    public void wrapArrayInteger(String identifier, int vecLeft, int vecRight, int... values){
        this.type = TYPE_INTEGER;
        this.identifier = identifier;
        this.vecLet = vecLeft;
        this.vecRight = vecRight;

        List<Integer> value = new ArrayList<>();
        for(Integer integer : values){
            value.add(integer);
        }

        this.value = value;
    }

}
