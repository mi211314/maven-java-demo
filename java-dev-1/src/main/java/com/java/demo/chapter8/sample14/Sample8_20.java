package com.java.demo.chapter8.sample14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_20
 *
 * @Date: 2018/12/9 22:08
 */
public class Sample8_20 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_20.class);

    public static void main(String[] args) {
        Car c = new Car();
        logger.info("调用的结果为：{}", c.startUp());
    }

}
