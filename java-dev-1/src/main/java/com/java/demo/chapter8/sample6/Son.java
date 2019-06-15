package com.java.demo.chapter8.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 *
 * @Date: 2018/11/25 21:31
 */
public class Son extends Father {

    private static final Logger logger = LoggerFactory.getLogger(Son.class);

    String s = "子类的成员变量";

    public void show() {
        logger.info("这里将调用的是:{}", s);
        logger.info("这里将调用的是:{}", super.s);
    }

}
