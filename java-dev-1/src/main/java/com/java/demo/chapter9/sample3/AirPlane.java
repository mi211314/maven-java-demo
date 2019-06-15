package com.java.demo.chapter9.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 *
 * @Date: 2018/12/18 07:17
 */
public abstract class AirPlane extends Vehicle implements Flyer {

    private static final Logger logger = LoggerFactory.getLogger(AirPlane.class);

    public void fly() {
        logger.info("我可以用飞机的方式在天空飞！！！");
    }

    @Override
    public void consume() {
        logger.info("我需要消耗汽油！！！");
    }

}
