package com.java.demo.chapter2.sample20;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample20
 *
 * @Date: 2018/9/2 16:15
 */
public class Sample20 {

    private static final Logger logger = LoggerFactory.getLogger(Sample20.class);

    public static void main(String[] args) {
        int i;
        byte b;
        double d;
        i = 300;
        d = 270.134354545;
        b = (byte) i;
        logger.info("把i强制转换为byte型后值为：{}", b);
        b = (byte) d;
        logger.info("把d强制转换为byte型后值为：{}", b);
        i = (int) d;
        logger.info("把d强制转换为int型后值为：{}", i);
    }

}
