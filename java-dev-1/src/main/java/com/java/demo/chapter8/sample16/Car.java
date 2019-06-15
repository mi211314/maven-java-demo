package com.java.demo.chapter8.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Car
 *
 * @Date: 2018/12/9 22:17
 */
public class Car {

    private static final Logger logger = LoggerFactory.getLogger(Car.class);

    public static void brake() {
        logger.info("正在汽车上刹车！！！");
    }

    public static void startUp() {
        logger.info("正在汽车上启动！！！");
    }

}
