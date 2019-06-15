package com.java.demo.chapter11.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_9
 *
 * @Date: 2019/3/8 22:31
 */
public class Sample11_9 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11_9.class);

    public static void main(String[] args) {
        int i = 60;
        String s = Integer.toBinaryString(i);
        logger.info("i转换为二进制：{}", s);
        s = Integer.toOctalString(i);
        logger.info("i转换为八进制：{}", s);
        s = Integer.toHexString(i);
        logger.info("i转换为十六进制：{}", s);
    }

}
