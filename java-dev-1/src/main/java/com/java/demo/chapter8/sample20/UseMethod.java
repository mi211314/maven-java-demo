package com.java.demo.chapter8.sample20;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: UseMethod
 *
 * @Date: 2018/12/16 20:35
 */
public class UseMethod {

    private static final Logger logger = LoggerFactory.getLogger(UseMethod.class);

    public void show(A a) {
        logger.info("调用的是具有A类型参数的方法！！！");
    }

    public void show(B b) {
        logger.info("调用的是具有B类型参数的方法！！！");
    }

}
