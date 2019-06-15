package com.java.demo.chapter10.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Animal
 *
 * @Date: 2019/1/17 17:37
 */
public class Animal {

    private static final Logger logger = LoggerFactory.getLogger(Animal.class);

    private String name;

    public Animal() {
        logger.info("我是Animal类的无参构造器！！！");
    }

    public Animal(String name) {
        logger.info("我是Animal类的有参构造器！！！");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
