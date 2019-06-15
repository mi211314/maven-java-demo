package com.java.demo.chapter10.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Animal
 *
 * @Date: 2019/1/19 12:08
 */
public class Animal {

    private static final Logger logger = LoggerFactory.getLogger(Animal.class);

    public Animal(String name) {
        logger.info("我是Animal类的构造器，参数name = {}", name);
    }

    public Animal() {
        this("Tom");
    }

}
