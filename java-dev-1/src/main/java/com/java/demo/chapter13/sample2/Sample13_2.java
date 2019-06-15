package com.java.demo.chapter13.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;

/**
 * @Description: Sample13_2
 *
 * @Date: 2019/4/8 22:29
 */
public class Sample13_2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13_2.class);

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = "Java核心技术大全";
        String s2 = new String(s1.getBytes(), "iso8859_1");
        logger.info("将s1转换为ISO8859_1编码格式，结果为：{}", s2);
        String s3 = new String(s2.getBytes("iso8859_1"), "gb2312");
        logger.info("将s1再转换为gb2312编码格式，结果为：{}", s3);
    }

}
