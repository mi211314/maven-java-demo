package com.java.demo.chapter10.sample14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Singleton
 *
 * @Date: 2019/1/19 12:17
 */
public class Singleton {

    private static final Logger logger = LoggerFactory.getLogger(Singleton.class);

    private static Singleton singleton;

    private Singleton() {
        logger.info("执行单列模式类的构造器！！！");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
