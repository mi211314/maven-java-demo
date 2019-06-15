package com.java.demo.chapter8.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Vehicle
 *
 * @Date: 2018/11/26 21:26
 */
public class Vehicle {

    private static final Logger logger = LoggerFactory.getLogger(Vehicle.class);

    public void startUp() {
        logger.info("一般交通工具的启动方法！！！");
    }

}
