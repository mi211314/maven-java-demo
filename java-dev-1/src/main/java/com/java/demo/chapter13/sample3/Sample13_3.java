package com.java.demo.chapter13.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample13_3
 *
 * @Date: 2019/4/11 07:04
 */
public class Sample13_3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13_3.class);

    public static void main(String[] args) {
        String s1 = "JavaSE7.0核心技术大全欢迎您！！！";
        String s2 = new String("恭喜你分别用两种不同的语法创建了字符串！！！");
        String s3;
        logger.info("=================================charAt================================");
        char c = s1.charAt(4);
        logger.info("从0开始数，字符串s1中第4个字符为：{}", c);
        logger.info("=============================toCharArray===============================");
        char[] array = s1.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            logger.info("{}", array[i]);
        }
        logger.info("==============================concat============================");
        s3 = s1.concat(s2);
        logger.info("将两个字符串连接后的结果为：{}", s3);
        logger.info("==============================equals============================");
        s3 = "JavaSE7.0核心技术大全欢迎您！！！";
        if (s1.equals(s3)) {
            logger.info("恭喜你测试成功，s1与s3中的内容是完全相同的！！！");
        }
        logger.info("=======================equalsIgnoreCase=======================");
        s3 = "JAVASE7.0核心技术大全欢迎您！！！";
        if (s1.equalsIgnoreCase(s3)) {
            logger.info("s1与s3中的内容在不区分大小写的情况下是相同的！！！");
        }
        logger.info("=============================length===========================");
        int size = s1.length();
        logger.info("s1中字符的个数为：{}", size);
        logger.info("=============================replace===========================");
        s3 = s1.replace('a', 'X');
        logger.info("将s1中所有的字母a换成字母X为：{}", s3);
        logger.info("============================substring===========================");
        s3 = s1.substring(10);
        logger.info("从0开始数，s1中第10个字符往后字符串为：{}", s3);
        logger.info("============================toLowerCase=========================");
        s3 = s1.toLowerCase();
        logger.info("将s1中的字符全换成小写：{}", s3);
        logger.info("============================toUpperCase=========================");
        s3 = s1.toUpperCase();
        logger.info("将s1中的字符全换成大写：{}", s3);
        logger.info("==============================trim===========================");
        s3 = "                         Java    SE7.0                  ";
        logger.info("s3没有用过trim方法前：[{}]", s3);
        s3 = s3.trim();
        logger.info("s3用过trim方法后：[{}]", s3);
    }

}
