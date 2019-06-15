package com.java.demo.chapter5.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample3
 *
 * @Date: 2018/9/9 13:24
 */
public class Sample3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample3.class);

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int[] foo = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                logger.info("{}", arr[i][j]);
            }
        }
        for (int i = 0; i < foo.length; i++) {
            logger.info("{}", foo[i]);
        }
    }

}
