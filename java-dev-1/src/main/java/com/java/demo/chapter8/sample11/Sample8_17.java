package com.java.demo.chapter8.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_17
 *
 * @Date: 2018/12/9 21:44
 */
public class Sample8_17 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_17.class);

    public static void main(String[] args) {
        Vehicle v = new Car();
        logger.info("轿车的价格为：{}", v.getMoney());
    }

}
