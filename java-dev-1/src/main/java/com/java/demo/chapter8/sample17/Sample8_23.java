package com.java.demo.chapter8.sample17;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_23
 *
 * @Date: 2018/12/9 22:29
 */
public class Sample8_23 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_23.class);

    public static void main(String[] args) {
        Car c = new Car();
        logger.info("c.startUp调用的结果为：");
        c.startUp();
    }

}
