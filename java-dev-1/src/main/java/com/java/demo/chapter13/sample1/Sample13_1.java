package com.java.demo.chapter13.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample13_1
 *
 * @Date: 2019/4/8 22:23
 */
public class Sample13_1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13_1.class);

    public static void main(String[] args) {
        String s1 = "Java核心技术大全欢迎您！！！";
        String s2 = new String("恭喜你分别用两种不同的语法创建了字符串！！！");
        String s3 = "";
        String s4 = null;
        logger.info("{}", s1 + "#" + s2 + "#" + s3 + "#" + s4);
    }

}
