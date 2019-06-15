package com.java.demo.chapter8.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Vehicle
 *
 * @Date: 2018/12/9 21:51
 */
public class Vehicle {

    private static final Logger logger = LoggerFactory.getLogger(Vehicle.class);

    public Father getMe() {
        Father f = new Father();
        logger.info("方法没有成功重写！！！");
        return f;
    }
    
}
