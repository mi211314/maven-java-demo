package com.java.demo.chapter2.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample4
 * @Date: 2018/9/1 14:11
 */
public class Sample4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample4.class);

    public static void main(String[] args) {
        float a;
        float b;
        double c;
        double d;
        a = 20.1f;
        b = -10.13455f;
        c = -100.64656;
        d = 3.27;
        logger.info("a的值为：{}", a);
        logger.info("b的值为：{}", b);
        logger.info("c的值为：{}", c);
        logger.info("d的值为：{}", d);
    }

}
