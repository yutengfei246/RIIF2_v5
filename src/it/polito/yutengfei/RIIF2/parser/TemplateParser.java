package it.polito.yutengfei.RIIF2.parser;

import it.polito.yutengfei.RIIF2.RIIF2Parser;
import it.polito.yutengfei.RIIF2.recoder.RIIF2Recorder;
import it.polito.yutengfei.RIIF2.recoder.Recorder;

/**
 * Created by yutengfei on 11/12/16.
 */
public class TemplateParser extends  InitializerParser implements Recorder{
    public TemplateParser(RIIF2Parser parser, RIIF2Recorder recorder) {
        super(parser);
    }

    @Override
    public RIIF2Recorder getRIIF2Recorder() {
        return null;
    }
}
