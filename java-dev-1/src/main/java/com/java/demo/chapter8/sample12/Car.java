package com.java.demo.chapter8.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Car
 *
 * @Date: 2018/12/9 21:52
 */
public class Car extends Vehicle {

    private static final Logger logger = LoggerFactory.getLogger(Car.class);

    @Override
    public Son getMe() {
        Son s = new Son();
        logger.info("方法成功重写！！！");
        return s;
    }

}
