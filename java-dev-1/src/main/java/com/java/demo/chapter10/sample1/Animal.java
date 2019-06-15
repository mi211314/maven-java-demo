package com.java.demo.chapter10.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Animal
 *
 * @Date: 2019/1/7 21:16
 */
public class Animal {

    private static final Logger logger = LoggerFactory.getLogger(Animal.class);

    public Animal() {
        logger.info("我是公有类型的构造器！！！");
    }

}
