package com.java.demo.chapter12.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample12_3
 *
 * @Date: 2019/3/25 07:50
 */
public class Sample12_3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12_3.class);

    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        method2();
    }

    static void method2() {
        int[] a = new int[3];
        a[4] = 12;
        logger.info("OK！！！");
    }

}
