package com.java.demo.chapter10.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Fruit
 *
 * @Date: 2019/1/19 12:02
 */
public class Fruit {

    private static final Logger logger = LoggerFactory.getLogger(Fruit.class);

    public Fruit() {

    }

    public Fruit(String name) {
        logger.info("执行Fruit类的构造器！！！");
    }

}
