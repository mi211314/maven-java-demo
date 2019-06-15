package com.java.demo.chapter2.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: PackageDemo
 *
 * @Date: 2018/9/2 13:33
 */
public class Sample15 {

    private static final Logger logger = LoggerFactory.getLogger(Sample15.class);

    public static void main(String[] args) {
        byte a = 5;
        short b = 30;
        int c = 100;
        float d = 2.55f;
        double e = 3.6528;
        char f = 'M';
        long g = 800L;
        double result = (a + b) - (g - c) + (d * e) + (a -f);
        logger.info("result的值为：{}", result);
    }

}
