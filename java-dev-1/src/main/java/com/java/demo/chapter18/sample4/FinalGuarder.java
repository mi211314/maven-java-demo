package com.java.demo.chapter18.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: FinalGuarder
 * @Author: miaolei
 * @Date: 2019/6/15 10:21
 */
public class FinalGuarder {

    private static final Logger logger = LoggerFactory.getLogger(FinalGuarder.class);

    private Object fg = new Object() {

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            logger.info("FinalGuarder类被进行垃圾收集时需要执行的finalize工作！！！");
        }
    };

}
