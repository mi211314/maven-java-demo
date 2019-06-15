package com.java.demo.chapter4.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample10
 *
 * @Date: 2018/9/5 23:04
 */
public class Sample10 {

    private static final Logger logger = LoggerFactory.getLogger(Sample10.class);

    public static void main(String[] args) {
        int m = 10;
        int n = 5;
        label:
        for (int i = 0; i < m; i++) {
            int j = 0;
            while (j < n) {
                logger.info("j = {}########################", j);
                if (j == 0) {
                    continue label;
                }
                j++;
            }
            logger.info("i = {}************************", i);
        }
    }

}
