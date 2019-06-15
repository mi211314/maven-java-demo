package com.java.demo.chapter12.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample12_4
 *
 * @Date: 2019/3/25 07:56
 */
public class Sample12_4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12_4.class);

    public static void main(String[] args) {
        try {
            int[] a = new int[4];
            logger.info("整型数组创建完毕！！！");
            a[3] = 9;
            logger.info("整型数组中第四个元素的数值为：{}", a[3]);
        } catch (NullPointerException e) {
            logger.info("这里出现的错误类型是：空引用！！！");
        } finally {
            logger.info("这里是finally块，无论是否抛出异常，这里总能执行！！！");
        }
    }

}
