package com.java.demo.chapter8.sample23;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_32
 *
 * @Date: 2018/12/16 21:20
 */
public class Sample8_32 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_32.class);

    public static void main(String[] args) {
        Car c = new Truck();
        logger.info("调用的方法为：");
        c.brake();
        c = new Mini();
        logger.info("调用的方法为：");
        c.brake();
    }

}
