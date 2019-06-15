package com.java.demo.chapter8.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Car
 *
 * @Date: 2018/12/9 22:11
 */
public class Car {

    private static final Logger logger = LoggerFactory.getLogger(Car.class);

    public static void brake() {
        logger.info("正在汽车上刹车！！！");
    }

}
