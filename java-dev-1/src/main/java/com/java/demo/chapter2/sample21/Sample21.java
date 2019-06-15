package com.java.demo.chapter2.sample21;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample21
 *
 * @Date: 2018/9/2 16:22
 */
public class Sample21 {

    private static final Logger logger = LoggerFactory.getLogger(Sample21.class);

    public static void main(String[] args) {
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        b = Byte.parseByte("12");
        s = Short.parseShort("50");
        i = Integer.parseInt("30");
        l = Long.parseLong("1500");
        f = Float.parseFloat("0.354");
        d = Double.parseDouble("1.11");
        logger.info("字符串12转换为byte型为：{}", b);
        logger.info("字符串50转换为short型为：{}", s);
        logger.info("字符串30转换为int型为：{}", i);
        logger.info("字符串1500转换为long型为：{}", l);
        logger.info("字符串0.354转换为float型为：{}", f);
        logger.info("字符串1.11转换为double型为：{}", d);
    }

}
