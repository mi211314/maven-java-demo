package com.java.demo.chapter5.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @Description: Sample11
 *
 * @Date: 2018/9/19 23:15
 */
public class Sample11 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11.class);

    public static void main(String[] args) {
        int[] a = {9, 1, 3, 4, 2, 5, 7, 6, 8};
        logger.info("数组a排序前为：{}", a);
        Arrays.sort(a);
        logger.info("数组a排序后为：{}", a);
    }

}
