package com.java.demo.chapter6.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample6
 *
 * @Date: 2018/10/15 23:47
 */
public class Sample6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample6.class);

    private int intMember = 66;

    private int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Sample6 ref = new Sample6();
        logger.info("intMember = {}", ref.intMember);
        int sum = ref.add(12, 13);
        logger.info("sum = {}", sum);
    }

}
