package com.java.demo.chapter10.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Animal
 *
 * @Date: 2019/1/7 21:31
 */
public class Animal {

    private static final Logger logger = LoggerFactory.getLogger(Animal.class);

    String name;

    int size;

    public Animal(String name, int size) {
        this.name = name;
        this.size = size;
        logger.info("有参构造器Animal(String name, int size)执行！！！");
    }

}
