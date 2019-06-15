package com.java.demo.chapter9.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample9_15
 *
 * @Date: 2019/1/1 22:42
 */
public class Sample9_15 {

    private static final Logger logger = LoggerFactory.getLogger(Sample9_15.class);

    public static void main(String[] args) {
        int[] intArray = new int[5];
        if (intArray instanceof int[]) {
            logger.info("intArray是int[]类型的！！！");
        }
        Son[] sonArray = new Son[2];
        if (sonArray instanceof Son[]) {
            logger.info("sonArray是Son[]类型的！！！");
        }
        if (sonArray instanceof Father[]) {
            logger.info("sonArray是Father[]类型的！！！");
        }
    }

}
