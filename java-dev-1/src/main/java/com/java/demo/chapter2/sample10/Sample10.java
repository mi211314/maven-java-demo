package com.java.demo.chapter2.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample10
 *
 * @Date: 2018/9/2 13:09
 */
public class Sample10 {

    private static final Logger logger = LoggerFactory.getLogger(Sample10.class);

    public static void main(String[] args) {
        int a;
        int b;
        char c = 'M';
        char d = 'N';
        double k = 2.81952;
        byte x = 10;
        byte y = 20;
        byte z;
        a = 1000;
        b = 10000;
        z = 110;
        logger.info("a的值为：{}", a);
        logger.info("b的值为：{}", b);
        logger.info("c的值为：{}", c);
        logger.info("d的值为：{}", d);
        logger.info("k的值为：{}", k);
        logger.info("x的值为：{}", x);
        logger.info("y的值为：{}", y);
        logger.info("z的值为：{}", z);
    }

}
