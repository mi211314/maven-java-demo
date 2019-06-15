package com.java.demo.chapter18.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Common
 * @Author: miaolei
 * @Date: 2019/6/15 10:15
 */
public class Common {

    private static final Logger logger = LoggerFactory.getLogger(Common.class);

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        logger.info("收集Common对象，调用了finalize方法！！！");
    }

}
