package com.java.demo.chapter2.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample7
 *
 * @Date: 2018/9/1 14:24
 */
public class Sample7 {

    private static final Logger logger = LoggerFactory.getLogger(Sample7.class);

    public static void main(String[] args) {
        char c1;
        c1 = 'm';
        logger.info("c1的值为：{}", c1);
        c1++;
        logger.info("c1 + 1后的值为：{}", c1);
    }

}
