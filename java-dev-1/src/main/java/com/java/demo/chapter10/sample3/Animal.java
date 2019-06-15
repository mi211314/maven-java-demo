package com.java.demo.chapter10.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Animal
 *
 * @Date: 2019/1/7 21:26
 */
public class Animal {

    private static final Logger logger = LoggerFactory.getLogger(Animal.class);

    public void Animal() {
        logger.info("我自认为是公有类型的构造器！！！");
    }

}
