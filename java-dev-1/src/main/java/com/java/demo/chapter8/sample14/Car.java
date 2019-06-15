package com.java.demo.chapter8.sample14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Car
 *
 * @Date: 2018/12/9 22:06
 */
public class Car extends Vehicle {

    private static final Logger logger = LoggerFactory.getLogger(Car.class);

    public int startUp() {
        logger.info("轿车的启动方法！！！");
        return 0;
    }

}
