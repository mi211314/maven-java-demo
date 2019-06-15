package com.java.demo.chapter8.sample17;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Vehicle
 *
 * @Date: 2018/12/9 22:27
 */
public class Vehicle {

    private static final Logger logger = LoggerFactory.getLogger(Vehicle.class);

    public void startUp() {
        logger.info("一般车辆的启动方法！！！");
    }

}
