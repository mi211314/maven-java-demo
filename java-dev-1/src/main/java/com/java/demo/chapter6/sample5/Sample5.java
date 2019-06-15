package com.java.demo.chapter6.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_5
 *
 * @Date: 2018/10/15 23:42
 */
public class Sample5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample5.class);

    private int a = 10;

    private int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Sample5 ref = new Sample5();
        logger.info("a = {}", ref.a);
        int sum = ref.add(12, 13);
        logger.info("sum = {}", sum);
    }

}
