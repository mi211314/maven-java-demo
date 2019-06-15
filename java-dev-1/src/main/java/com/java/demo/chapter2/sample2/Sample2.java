package com.java.demo.chapter2.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample2
 *
 * @Date: 2018/9/1 14:00
 */
public class Sample2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample2.class);

    public static void main(String[] args) {
        int i;
        int k;
        int a;
        int d;
        i = 2147483647;
        k = -2147483648;
        a = i + 1;
        d = k - 1;
        logger.info("a={}",a);
        logger.info("d={}",d);
    }

}
