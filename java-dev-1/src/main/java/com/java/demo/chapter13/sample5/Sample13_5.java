package com.java.demo.chapter13.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample13_5
 *
 * @Date: 2019/4/11 07:51
 */
public class Sample13_5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13_5.class);

    public static void main(String[] args) {
        String s1 = "JavaSE7.0";
        String s2 = new String("JavaSE7.0");
        if (s1 == s2) {
            logger.info("字符串s1与字符串s2引用的是同一个对象！！！");
        } else {
            logger.info("字符串s1与字符串s2引用的不是同一个对象！！！");
        }
        if (s1.intern() == s2.intern()) {
            logger.info("字符串s1与字符串s2在字符串常量池中联系的是同一个对象！！！");
        } else {
            logger.info("字符串s1与字符串s2在字符串常量池中联系的不是同一个对象！！！");
        }
    }

}
