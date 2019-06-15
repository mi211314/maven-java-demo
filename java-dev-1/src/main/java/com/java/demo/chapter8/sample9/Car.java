package com.java.demo.chapter8.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Car
 *
 * @Date: 2018/11/26 21:28
 */
public class Car extends Vehicle {

    private static final Logger logger = LoggerFactory.getLogger(Car.class);

    @Override
    public void startUp() {
        logger.info("轿车的启动方法！！！");
    }

}
