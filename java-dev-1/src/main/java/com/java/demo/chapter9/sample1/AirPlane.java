package com.java.demo.chapter9.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: AirPlane
 *
 * @Date: 2018/12/16 21:44
 */
public class AirPlane implements Flyer{

    private static final Logger logger = LoggerFactory.getLogger(AirPlane.class);

    public void setFlyHeight(int height) {
        switch (height) {
            case HIGH:
                logger.info("我现在处在高空飞行状态!!!");
                break;
            case MIDDLE:
                logger.info("我现在处在中等高度飞行状态！！！");
                break;
            case LOW:
                logger.info("我现在处在低空飞行状态");
                break;
            default:
                break;
        }
    }

}
