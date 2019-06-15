package com.java.demo.chapter5.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample9
 *
 * @Date: 2018/9/18 07:25
 */
public class Sample9 {

    private static final Logger logger = LoggerFactory.getLogger(Sample9.class);

    public static void main(String[] args) {
        int[] list = {83, 33, 54, 25, 5, 35, 26, 74, 98, 102};
        int i;
        int j;
        int x;
        for (i = list.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (list[i] < list[j]) {
                    x = list[i];
                    list[i] = list[j];
                    list[j] = x;
                }
            }
        }
        logger.info("The sorted list is:{}", list);
    }

}
