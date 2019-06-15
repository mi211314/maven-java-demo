package com.java.demo.chapter5.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_5
 *
 * @Date: 2018/9/9 13:38
 */
public class Sample5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample5.class);

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {1, 2, 2, 3}
        };
        int i;
        int j;
        int t;
        int max;
        int flag;
        int n = 0;
        int m = 4;
        for (i = 0; i < m; i++) {
            t = a[i][0];
            max = 0;
            for (j = 1; j < m; j++) {
                if(a[i][j] > t) {
                    t = a[i][j];
                    max = j;
                }
            }
            t = a[i][max];
            flag = 1;
            for (j = 0; j < m; j++) {
                if(a[j][max] < t) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                logger.info("鞍点是：（{}.{}），值是：{}", i, max, a[i][max]);
                n++;
            }
        }
        if (n == 0) {
            logger.info("没有鞍点！");
        }
    }

}
