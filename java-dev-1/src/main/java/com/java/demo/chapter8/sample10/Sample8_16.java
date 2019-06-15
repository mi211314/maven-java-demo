package com.java.demo.chapter8.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_16
 *
 * @Date: 2018/11/26 21:38
 */
public class Sample8_16 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_16.class);

    public static void main(String[] args) {
        Vehicle v = new Car();
        logger.info("实际调用的方法为：");
        v.startUp();
    }

}
