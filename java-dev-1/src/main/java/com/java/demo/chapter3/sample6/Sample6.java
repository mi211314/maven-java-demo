package com.java.demo.chapter3.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample6
 *
 * @Date: 2018/9/2 21:54
 */
public class Sample6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample6.class);

    public static void main(String[] args) {
        logger.info("{}", (12.0 / 0 == Double.POSITIVE_INFINITY));
        logger.info("{}", (-12.0 / 0) == Double.NEGATIVE_INFINITY);
        logger.info("{}", (12.0 % 0));
        logger.info("{}", (12.0 % 0) == Double.NaN);
    }

}
