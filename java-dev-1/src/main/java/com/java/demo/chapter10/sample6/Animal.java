package com.java.demo.chapter10.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Animal
 *
 * @Date: 2019/1/7 22:10
 */
public class Animal {

    private static final Logger logger = LoggerFactory.getLogger(Animal.class);

    public Animal() {
        logger.info("我是Animal类的构造器！！！");
    }

}
