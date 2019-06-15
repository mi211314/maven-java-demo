package com.java.demo.chapter13.sample14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample13_14
 *
 * @Date: 2019/4/14 14:47
 */
public class Sample13_14 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13_14.class);

    public static void main(String[] args) {
        String patternStr = ";|,";
        String str = "Tom;Lucy,Jerry;";
        logger.info("待切割字符串的初始内容为：{}", str);
        logger.info("将字符串切割默认份，结果为：");
        String[] attStr = str.split(patternStr);
        for (int i = 0; i < attStr.length; i++) {
            logger.info("arrStr[{}]=<{}>", i, attStr[i]);
        }
        logger.info("将字符串切3份，结果为：");
        attStr = str.split(patternStr, 3);
        for (int i = 0; i < attStr.length; i++) {
            logger.info("arrStr[{}]=<{}>", i, attStr[i]);
        }
        logger.info("将字符串切-2份，结果为：");
        attStr = str.split(patternStr, -2);
        for (int i = 0; i < attStr.length; i++) {
            logger.info("arrStr[{}]=<{}>", i, attStr[i]);
        }
        logger.info("将字符串切0份，结果为：");
        attStr = str.split(patternStr, 0);
        for (int i = 0; i < attStr.length; i++) {
            logger.info("arrStr[{}]=<{}>", i, attStr[i]);
        }
    }

}
