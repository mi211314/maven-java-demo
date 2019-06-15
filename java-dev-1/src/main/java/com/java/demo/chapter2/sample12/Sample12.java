package com.java.demo.chapter2.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample12
 *
 * @Date: 2018/9/2 13:19
 */
public class Sample12 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12.class);

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        {
            int x = 5;
            int y;
            y = b + 1;
            logger.info("输出a的值：{}", a);
            logger.info("输出x的值：{}", x);
            logger.info("输出y的值：{}", y);
        }
    }

}
