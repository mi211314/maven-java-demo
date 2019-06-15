package com.java.demo.chapter2.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_5
 *
 * @Date: 2018/9/1 14:17
 */
public class Sample5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample5.class);

    public static void main(String[] args) {
        double pi;
        double r;
        double squ;
        pi = 3.141593;
        r = 12.15;
        squ = pi * r * r * 60 / 360;
        logger.info("squ={}", squ);
    }

}
