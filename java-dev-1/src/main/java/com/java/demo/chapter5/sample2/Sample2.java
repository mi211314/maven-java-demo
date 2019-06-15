package com.java.demo.chapter5.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample2
 *
 * @Date: 2018/9/9 13:12
 */
public class Sample2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample2.class);

    public static void main(String[] args) {
        int m = 2;
        int n = 10;
        int[] f = new int[10];
        f[0] = f[1] = 1;
        for (int i = m; i < n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 1; i <= n; i++) {
            logger.info("F[{}] = {}", i, f[i - 1]);
        }
    }

}
