package com.java.demo.chapter8.sample23;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Mini
 *
 * @Date: 2018/12/16 21:18
 */
public class Mini extends Car {

    private static final Logger logger = LoggerFactory.getLogger(Mini.class);

    @Override
    public void brake() {
        logger.info("正在面包车上刹车！！！");
    }

}
