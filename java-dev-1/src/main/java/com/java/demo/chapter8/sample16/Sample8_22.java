package com.java.demo.chapter8.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_22
 *
 * @Date: 2018/12/9 22:21
 */
public class Sample8_22 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_22.class);

    public static void main(String[] args) {
        logger.info("Truck.brake()调用的方法为：");
        Truck.brake();
        logger.info("Truck.startUp()调用的方法为：");
        Truck.startUp();
        logger.info("Car.brake()调用的方法为：");
        Car.brake();
    }

}
