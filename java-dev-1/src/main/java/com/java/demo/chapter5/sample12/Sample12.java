package com.java.demo.chapter5.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @Description: Sample12
 *
 * @Date: 2018/9/19 23:20
 */
public class Sample12 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12.class);

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 3, 4};
        logger.info("{}", Arrays.equals(a1, a2));
        a2[2] = 6;
        logger.info("{}", Arrays.equals(a1, a2));
    }

}
