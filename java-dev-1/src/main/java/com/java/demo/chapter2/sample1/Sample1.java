package com.java.demo.chapter2.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample1
 *
 * @Date: 2018/9/1 13:49
 */
public class Sample1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample1.class);

    public static void main(String[] args) {
        int a = 20;
        int x = -10;
        long b = -100L;
        long l = 50L;
        short c = 50;
        short y = -1;
        byte d = 4;
        byte z = 0;
        logger.info("a的值为：{}", a);
        logger.info("x的值为：{}", x);
        logger.info("b的值为：{}", b);
        logger.info("l的值为：{}", l);
        logger.info("c的值为：{}", c);
        logger.info("y的值为：{}", y);
        logger.info("d的值为：{}", d);
        logger.info("z的值为：{}", z);
    }

}
