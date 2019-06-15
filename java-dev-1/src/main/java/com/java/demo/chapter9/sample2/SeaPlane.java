package com.java.demo.chapter9.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: SeaPlane
 *
 * @Date: 2018/12/16 21:57
 */
public class SeaPlane extends AirPlane implements Sailer {

    private static final Logger logger = LoggerFactory.getLogger(SeaPlane.class);

    @Override
    public void doAirPlaneThing() {
        logger.info("水上飞机是一个飞机！！！");
    }

    public void fly() {
        logger.info("水上飞机可以飞行！！！");
    }

    public void dock() {
        logger.info("水上飞机可以航行！！！");
    }

}
