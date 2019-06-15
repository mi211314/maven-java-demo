package com.java.demo.chapter4.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8
 *
 * @Date: 2018/9/5 22:46
 */
public class Sample8 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8.class);

    public static void main(String[] args) {
        for (int i = init(); condition(i); i++, update(i)) {
            logger.info("循环体{}", i);
        }
    }

    private static int init() {
        logger.info("初始化");
        return 0;
    }

    private static boolean condition(int i) {
        logger.info("条件表达式{}", i);
        return i < 2;
    }

    private static void update(int i) {
        logger.info("更新表达式{}", i);
    }

}
