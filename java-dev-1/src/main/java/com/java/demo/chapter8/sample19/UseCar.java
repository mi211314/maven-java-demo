package com.java.demo.chapter8.sample19;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: UseCar
 *
 * @Date: 2018/12/16 20:23
 */
public class UseCar {

    private static final Logger logger = LoggerFactory.getLogger(UseCar.class);

    public void show(Vehicle v) {
        logger.info("调用的是具有Vehicle参数的方法！！！");
    }

    public void show (Car c) {
        logger.info("调用的是具有Car参数的方法！！！");
    }

}
