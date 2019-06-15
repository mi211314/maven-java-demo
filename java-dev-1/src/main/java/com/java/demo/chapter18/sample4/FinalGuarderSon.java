package com.java.demo.chapter18.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: FinalGuarderSon
 * @Author: miaolei
 * @Date: 2019/6/15 10:24
 */
public class FinalGuarderSon extends FinalGuarder {

    private static final Logger logger = LoggerFactory.getLogger(FinalGuarderSon.class);

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        logger.info("FinalGuarderSon类被进行垃圾收集时需要执行的finalize工作！！！");
    }

}
