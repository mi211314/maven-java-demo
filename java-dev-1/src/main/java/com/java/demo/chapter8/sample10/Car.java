package com.java.demo.chapter8.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Car
 *
 * @Date: 2018/11/26 21:37
 */
public class Car extends Vehicle {

    private static final Logger logger = LoggerFactory.getLogger(Car.class);

    public void startUp(int i) {
        logger.info("轿车的启动方法！！！");
    }

}
