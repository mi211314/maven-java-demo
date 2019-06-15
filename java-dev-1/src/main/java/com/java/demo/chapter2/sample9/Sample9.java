package com.java.demo.chapter2.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample9
 *
 * @Date: 2018/9/2 13:00
 */
public class Sample9 {

    private static final Logger logger = LoggerFactory.getLogger(Sample9.class);

    public static void main(String[] args) {
        int a = 1;
        int b = 012;
        int c = 0X10;
        double d = 1.2D;
        double e = 1.23e4;
        char f = '\t';
        char g = '\n';
        char h = '\'';
        logger.info("变量a的值为：{}", a);
        logger.info("变量b的值为：{}", b);
        logger.info("变量c的值为：{}", c);
        logger.info("变量d的值为：{}", d);
        logger.info("变量e的值为：{}", e);
        logger.info("变量f的值为：{}", f);
        logger.info("变量g的值为：{}", g);
        logger.info("变量h的值为：{}", h);
        logger.info("输出字符串常量abcd:{}", "abcd");
    }

}
