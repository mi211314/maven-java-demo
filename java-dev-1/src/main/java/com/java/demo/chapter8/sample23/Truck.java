package com.java.demo.chapter8.sample23;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Truck
 *
 * @Date: 2018/12/16 21:17
 */
public class Truck extends Car {

    private static final Logger logger = LoggerFactory.getLogger(Truck.class);

    @Override
    public void brake() {
        logger.info("正在卡车上刹车！！！");
    }

}
