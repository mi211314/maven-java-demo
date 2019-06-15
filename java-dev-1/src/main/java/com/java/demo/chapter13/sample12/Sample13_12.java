package com.java.demo.chapter13.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample13_12
 *
 * @Date: 2019/4/14 14:31
 */
public class Sample13_12 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13_12.class);

    public static void main(String[] args) {
        String patternStr = "\\d{4}-\\d{2}-\\d{2}";
        String s1 = "9999-66-88";
        String s2 = "内容为：9999-66-88";
        if (s1.matches(patternStr)) {
            logger.info("恭喜你，字符串s1满足指定的格式要求！！！");
        } else {
            logger.info("测试失败，字符串s1不满足指定的格式要求！！！");
        }
        if (s2.matches(patternStr)) {
            logger.info("恭喜你，字符串s2满足指定的格式要求！！！");
        } else {
            logger.info("测试失败，字符串s2不满足指定的格式要求！！！");
        }
    }

}
