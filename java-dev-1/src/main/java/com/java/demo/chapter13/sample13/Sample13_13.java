package com.java.demo.chapter13.sample13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample13_13
 *
 * @Date: 2019/4/14 14:38
 */
public class Sample13_13 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13_13.class);

    public static void main(String[] args) {
        String patternStr = "\\b\\d*\\.\\d{3,}\\b";
        String s1 = "123.5 123.56 123.5678 123.5600 123.0098";
        logger.info("初始字符串内容为：{}", s1);
        String s2 = s1.replaceAll(patternStr, "Error");
        logger.info("使用replaceAll对其进行匹配替换后：{}", s2);
        s2 = s1.replaceFirst(patternStr, "Error");
        logger.info("使用replaceFirst对其进行匹配替换后：{}", s2);
    }

}
