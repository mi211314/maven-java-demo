package com.java.demo.chapter10.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Animal
 *
 * @Date: 2019/1/7 21:20
 */
public class Animal {

    private static final Logger logger = LoggerFactory.getLogger(Animal.class);

    private Animal() {
        logger.info("我是私有类型的构造器！！！");
    }

    public static Animal getMe() {
        return new Animal();
    }

}
