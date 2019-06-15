package com.java.demo.chapter3.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_5
 *
 * @Date: 2018/9/2 21:49
 */
public class Sample5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample5.class);

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int m = 3 * a++;
        int n = 3 * ++b;
        logger.info("m = {},a = {}", m, a);
        logger.info("n = {},b = {}", n, b);
    }

}
