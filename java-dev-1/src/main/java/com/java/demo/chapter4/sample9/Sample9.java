package com.java.demo.chapter4.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample9
 *
 * @Date: 2018/9/5 22:54
 */
public class Sample9 {

    private static final Logger logger = LoggerFactory.getLogger(Sample9.class);

    public static void main(String[] args) {
        int m = 3;
        int n = 6;
        for (int i = 0; i < m; i++) {
            logger.info("i = {}***************", i);
            for (int j = 0; j < n; j++) {
                logger.info("j = {}###############", j);
                if (j > 2) {
                    break;
                }
            }
        }
    }

}
