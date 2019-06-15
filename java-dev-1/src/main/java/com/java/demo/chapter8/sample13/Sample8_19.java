package com.java.demo.chapter8.sample13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_19
 *
 * @Date: 2018/12/9 22:02
 */
public class Sample8_19 {

    private static Logger logger = LoggerFactory.getLogger(Sample8_19.class);

    public static void main(String[] args) {
        Car c = new Car();
        logger.info("调用的结果为：");
        c.startUp();
    }

}
