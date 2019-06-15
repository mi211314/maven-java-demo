package com.java.demo.chapter8.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Truck
 *
 * @Date: 2018/12/9 22:19
 */
public class Truck extends Car {

    private static final Logger logger = LoggerFactory.getLogger(Truck.class);

    public static void brake() {
        logger.info("正在卡车上刹车！！！");
    }

}
