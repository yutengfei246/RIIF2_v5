package it.polito.yutengfei.RIIF2.recoder;

import it.polito.yutengfei.RIIF2.RIIF2Modules.parts.Constant;
import it.polito.yutengfei.RIIF2.RIIF2Modules.parts.Label;
import it.polito.yutengfei.RIIF2.RIIF2Modules.parts.Parameter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RIIF2Recorder implements Recorder{

    private Map<String,RIIF2Recorder> tempRecorderMap = new HashMap<>();
    private Map<String,RIIF2Recorder> componentRecorderMap = new HashMap<>();

    private String identifier = null;
    private Boolean template = null;

    private List<String> eXIdentifiers = null ;
    private List<String> implIdentifiers = null;

    private List<Parameter> parameters = null;
    private List<Constant> constants = null;

    private List<Parameter> abstractParameters = null;
    private List<Constant> abstractConstants = null;

    private void put(RIIF2Recorder recorder) {
        this.tempRecorderMap = recorder.getTempRecorderMap();
        this.componentRecorderMap = recorder.getComponentRecorderMap();

        if (recorder.isTemplate()) {
            this.tempRecorderMap.put(recorder.getIdentifier(), recorder);
        } else
            this.componentRecorderMap.put(recorder.getIdentifier(), recorder);
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public RIIF2Recorder getRIIF2Recorder() {
        if( this.getIdentifier() == null)
            return this;

        RIIF2Recorder retRecorder = new RIIF2Recorder();
        retRecorder.put(this);

        return retRecorder;
    }

    public boolean containsComponent(String exId) {
        return this.componentRecorderMap.containsKey(exId);
    }

    public boolean containsTemplate(String implId){
        return this.tempRecorderMap.containsKey(implId);
    }

    public Map<String,RIIF2Recorder> getTempRecorderMap() {
        return tempRecorderMap;
    }

    public Map<String,RIIF2Recorder> getComponentRecorderMap() {
        return componentRecorderMap;
    }

    public boolean isTemplate() {
        return template;
    }

    public void seteXIdentifiers(List<String> eXIdentifiers) {
        this.eXIdentifiers = eXIdentifiers;
    }

    public void setImplIdentifiers(List<String> implIdentifiers) {
        this.implIdentifiers = implIdentifiers;
    }

    public void addConstant(Label<Object> fieldLabel) {
        if (this.constants == null)
            this.constants = new ArrayList<>();
        this.constants.add((Constant) fieldLabel);
    }

    public void addParameter(Label<Object> fieldLabel) {
        if( this.parameters == null)
            this.parameters = new ArrayList<>();

        this.parameters.add((Parameter) fieldLabel);
    }
}
