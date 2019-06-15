package com.java.demo.chapter5.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample1
 *
 * @Date: 2018/9/5 23:26
 */
public class Sample1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample1.class);

    public static void main(String[] args) {
        int i;
        int[] a = new int[5];
        for (i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (i = a.length - 1; i >= 0; i--) {
            logger.info("a[{}] = {}", i, a[i]);
        }
    }

}
