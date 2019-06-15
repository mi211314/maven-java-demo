package com.java.demo.chapter5.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8
 *
 * @Date: 2018/9/18 07:11
 */
public class Sample8 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8.class);

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 7, 8, 9, 23, 34, 45, 46, 67};
        int index = -1;
        int left = 0;
        int mid = -1;
        int right;
        right = a.length;
        int num = 46;
        while (left <= right) {
            mid = (left + right) / 2;
            if (a[mid] == num) {
                index = mid;
                break;
            } else if (a[mid] < num) {
                left = mid + 1;
            } else if (a[mid] > num) {
                right = mid - 1;
            }
        }
        if (index == -1) {
            logger.info("数字{}不在数组中！", num);
        } else {
            logger.info("数字{}在数组中的位置是：{}", num, index);
        }
    }

}
