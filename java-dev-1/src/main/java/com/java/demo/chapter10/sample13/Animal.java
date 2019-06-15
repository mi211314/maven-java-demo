package com.java.demo.chapter10.sample13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Animal
 *
 * @Date: 2019/1/19 12:13
 */
public class Animal {

    private static final Logger logger = LoggerFactory.getLogger(Animal.class);

    public Animal() {
        logger.info("这里是构造器！！！");
    }

    public void show() {
        logger.info("方法不能调用构造器！！！");
    }

}
