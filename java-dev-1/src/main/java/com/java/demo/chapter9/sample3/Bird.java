package com.java.demo.chapter9.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Bird
 *
 * @Date: 2018/12/18 07:31
 */
public class Bird extends Animal implements Flyer {

    private static final Logger logger = LoggerFactory.getLogger(Bird.class);

    @Override
    public void eat() {
        logger.info("我需要吃东西！！！");
    }

    public void fly() {
        logger.info("我可以用动物的方式在天空飞！！！");
    }

}
