package com.java.demo.chapter13.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample13_4
 *
 * @Date: 2019/4/11 07:36
 */
public class Sample13_4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13_4.class);

    public static void main(String[] args) {
        String s1 = "JavaSE7.0";
        String s2 = "JavaSE7.0";
        String s3 = new String("JavaSE7.0");
        if (s1 == s2) {
            logger.info("字符串s1与字符串s2通过等于测试，结果返回true");
        } else {
            logger.info("字符串s1与字符串s2没有通过等于测试，结果返回false");
        }
        if (s1 == s3) {
            logger.info("字符串s1与字符串s3通过等于测试，结果返回true");
        } else {
            logger.info("字符串s1与字符串s3没有通过等于测试，结果返回false");
        }
        if (s1.equals(s3)) {
            logger.info("字符串s1与字符串s3内容相同，结果返回true");
        } else {
            logger.info("字符串s1与字符串s3内容不同，结果返回false");
        }
    }

}
