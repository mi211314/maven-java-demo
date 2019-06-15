package com.java.demo.chapter10.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Bird
 *
 * @Date: 2019/1/7 22:11
 */
public class Bird extends Animal {

    private static final Logger logger = LoggerFactory.getLogger(Bird.class);

    public Bird() {
        logger.info("我是Bird类的构造器！！！");
    }

}
