/**
 * Created by yutengfei on 17/12/16.
 */
public class RIIF2WrapperFactory {

    public static RIIF2Wrapper newIntegerWrapper(String identifier, Integer value){
        RIIF2Wrapper riif2Wrapper = new RIIF2Wrapper();
        riif2Wrapper.wrapInteger(identifier, value );
        return riif2Wrapper;
    }
}
