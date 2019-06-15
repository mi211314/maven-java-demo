package com.java.demo.chapter13.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample13_6
 *
 * @Date: 2019/4/11 22:15
 */
public class Sample13_6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13_6.class);

    public static void main(String[] args) {
        String s1 = "JavaSE7.0";
        String s2 = "核心技术大全";
        s2 = s1.concat(s2);
        logger.info("对字符串s1进行连接字符串操作，字符串s1与s2的结果为：");
        logger.info("s1 = {}", s1);
        logger.info("s2 = {}", s2);
    }

}
