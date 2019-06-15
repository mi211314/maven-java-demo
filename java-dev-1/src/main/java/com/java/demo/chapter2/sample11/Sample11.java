package com.java.demo.chapter2.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11
 *
 * @Date: 2018/9/2 13:16
 */
public class Sample11 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11.class);

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int sum = a + b + c;
        int res = a * b * c;
        logger.info("a的值为：{}", a);
        logger.info("b的值为：{}", b);
        logger.info("c的值为：{}", c);
        logger.info("sum的值为：{}", sum);
        logger.info("res的值为：{}", res);
    }

}
