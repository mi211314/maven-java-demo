package com.java.demo.chapter12.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample12_1
 *
 * @Date: 2019/3/25 07:40
 */
public class Sample12_1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12_1.class);

    public static void main(String[] args) {
        try {
            int[] a = new int[3];
            a[2] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.info("这里出现的错误类型是：数组下标越界！！！");
        } catch (NullPointerException e) {
            logger.info("这里出现的错误类型是：空引用！！！");
        }
    }

}
