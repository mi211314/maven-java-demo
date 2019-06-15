package com.java.demo.chapter8.sample18;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Description: Adder
 *
 * @Date: 2018/12/10 07:29
 */
public class Adder {

    private static final Logger logger = LoggerFactory.getLogger(Adder.class);

    public int add(int i, int j) {
        logger.info("两个int参数的方法被调用。");
        return i + j;
    }

    public double add(double i, double j) {
        logger.info("两个double参数的方法被。");
        return i + j;
    }

}
