package com.java.demo.chapter8.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_15
 *
 * @Date: 2018/11/26 21:29
 */
public class Sample8_15 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_15.class);

    public static void main(String[] args) {
        Car c = new Car();
        logger.info("实际调用的方法为：");
        c.startUp();
        Vehicle v = new Car();
        logger.info("实际调用的方法为：");
        v.startUp();
    }

}
