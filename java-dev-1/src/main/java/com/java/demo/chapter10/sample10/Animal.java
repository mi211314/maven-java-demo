package com.java.demo.chapter10.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Animal
 *
 * @Date: 2019/1/17 17:44
 */
public class Animal {

    private static final Logger logger = LoggerFactory.getLogger(Animal.class);

    public Animal() {
        logger.info("执行Animal类的无参构造器！！！");
    }

    public Animal(String name) {
        logger.info("执行Animal类的有参构造器！！！");
    }

}
