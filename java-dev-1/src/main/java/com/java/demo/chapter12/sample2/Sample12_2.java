package com.java.demo.chapter12.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample12_2
 *
 * @Date: 2019/3/25 07:44
 */
public class Sample12_2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12_2.class);

    public static void main(String[] args) {
        try {
            int[] a = new int[4];
            logger.info("整型数组创建完毕！！！");
            a[3] = 9;
            logger.info("整型数组中第四个元素的数值为：{}", a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.info("这里出现的错误类型是：数组下标越界！！！");
        } catch (NullPointerException e) {
            logger.info("这里出现的错误类型是：空引用！！！");
        }
        logger.info("主程序正常结束！！！");
    }

}
