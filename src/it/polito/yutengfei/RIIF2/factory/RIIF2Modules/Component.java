package it.polito.yutengfei.RIIF2.factory.RIIF2Modules;

import it.polito.yutengfei.RIIF2.factory.utility.FieldFactory;

import java.util.List;

/**
 * A class that responsible for creating component class which includes everything
 */
public class Component {

    private String identifier = null;

    private String importBuffer = "import java.util.*;\r\n";
    ;
    private StringBuffer classIdentifier = new StringBuffer();
    private StringBuffer implementedBuffer = new StringBuffer();
    private StringBuffer extendedBuffer = new StringBuffer();
    private StringBuffer fieldBuffer = new StringBuffer();


    public void add(FieldFactory fieldFactory) {
        this.fieldBuffer.append( fieldFactory.getJavaFieldLine());
    }

    public void print() {
        System.out.print(fieldBuffer);
    }

    public void setIdentifier(String identifier){
        this.identifier = identifier;

        this.classIdentifier.append("public class ");
        this.classIdentifier.append(this.getIdentifier());
        this.classIdentifier.append(" ");
        this.classIdentifier.append("{");
        this.classIdentifier.append("\r\n");
    }

    public void setImplemented(List<String> implemented) {

        if( implemented == null || implemented.size() == 0)
            return;

        this.implementedBuffer.append("\tprivate final List<String> ");
        this.implementedBuffer.append("impls ");
        this.implementedBuffer.append("= new ArrayList<String>() {{ \r\n");
        for (String identifier : implemented) {
            this.implementedBuffer.append("\tadd(\"" + identifier + "\");\r\n");
        }
        this.implementedBuffer.append("}};\r\n");
    }

    public void setExtended(List<String> extended) {

        if( extended == null || extended.size() == 0)
            return ;

        this.extendedBuffer.append("\tprivate final List<String> ");
        this.extendedBuffer.append("exts ");
        this.extendedBuffer.append("= new ArrayList<String>() {{ \r\n");
        for (String identifier : extended) {
            this.extendedBuffer.append("\tadd(\"" + identifier + "\");\r\n");
        }
        this.extendedBuffer.append("}};\r\n");

    }

    public String getIdentifier() {
        return identifier;
    }

    public StringBuffer getClassIdentifier(){return this.classIdentifier;}

    public StringBuffer getField(){return this.fieldBuffer;}

    public StringBuffer getImpls(){return this.implementedBuffer;}

    public StringBuffer getExts(){return this.extendedBuffer;}

    public String getImports(){return  this.importBuffer;}

    public String getEnd() {
        return "}";
    }
}
