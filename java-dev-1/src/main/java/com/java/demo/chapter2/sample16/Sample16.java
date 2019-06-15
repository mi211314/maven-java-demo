package com.java.demo.chapter2.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample16
 *
 * @Date: 2018/9/2 13:38
 */
public class Sample16 {

    private static final Logger logger = LoggerFactory.getLogger(Sample16.class);

    public static void main(String[] args) {
        byte a;
        int b;
        short c;
        long d;
        float e;
        double f;
        a = 100;
        b = a;
        c = a;
        d = a;
        e = a;
        f = a;
        logger.info("a的值为：{}", a);
        logger.info("b的值为：{}", b);
        logger.info("c的值为：{}", c);
        logger.info("d的值为：{}", d);
        logger.info("e的值为：{}", e);
        logger.info("f的值为：{}", f);
    }

}
