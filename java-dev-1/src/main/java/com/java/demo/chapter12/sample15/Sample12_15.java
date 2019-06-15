package com.java.demo.chapter12.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample12_15
 *
 * @Date: 2019/4/8 22:08
 */
public class Sample12_15 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12_15.class);

    public static void main(String[] args) {
        try {
            int[] a = new int[4];
            a[4] = 9;
        } catch (Exception e) {
            logger.error("异常种类及消息为：{}。", e.toString());
        }
    }

}
