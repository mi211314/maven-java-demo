package com.java.demo.chapter3.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample2
 *
 * @Date: 2018/9/2 16:58
 */
public class Sample2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample2.class);

    public static void main(String[] args) {
        String a = "三加七为：";
        String b = "是结果。";
        int m = 3;
        int n = 7;
        String i = a + (m + n);
        String j = m + n + b;
        logger.info("a + m + n = {}", i);
        logger.info("m + n + b = {}", j);
    }

}
