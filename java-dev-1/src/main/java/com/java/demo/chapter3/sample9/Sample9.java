package com.java.demo.chapter3.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample9
 *
 * @Date: 2018/9/3 07:21
 */
public class Sample9 {

    private static final Logger logger = LoggerFactory.getLogger(Sample9.class);

    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        int c = a > b ? a : b;
        logger.info("a = {},b = {},a与b中比较大的为：{}", a, b, c);
    }

}
