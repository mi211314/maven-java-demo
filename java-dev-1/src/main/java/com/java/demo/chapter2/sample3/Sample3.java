package com.java.demo.chapter2.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample3
 *
 * @Date: 2018/9/1 14:05
 */
public class Sample3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample3.class);

    public static void main(String[] args) {
        int lightSpeed;
        long seconds;
        long dis;
        lightSpeed = 300000000;
        seconds = 10 * 365 * 24 * 60 * 60L;
        dis = lightSpeed * seconds;
        logger.info("十光年大约为{}米。", dis);
    }

}
