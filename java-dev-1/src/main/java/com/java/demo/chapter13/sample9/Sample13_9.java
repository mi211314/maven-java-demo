package com.java.demo.chapter13.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample13_9
 *
 * @Date: 2019/4/11 22:45
 */
public class Sample13_9 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13_9.class);

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Java7.0");
        logger.info("操作之前对象sb1的内容为：{}", sb1);
        sb1.append("核心技术大全").insert(4, "SE").delete(9, 15).reverse();
        logger.info("一系列操作之后对象sb1的内容为：{}", sb1);
        StringBuffer sb2 = new StringBuffer(sb1.toString());
        logger.info("==使用StringBuffer的equals方法测试对象sb1与sb2的内容==");
        if (sb1.equals(sb2)) {
            logger.info("对象sb1与sb2的内容相同！！！");
        } else {
            logger.info("对象sb1与sb2的内容不相同！！！");
        }
        logger.info("==使用toString()方法后使用equals方法测试对象sb1与sb2的内容==");
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        if (s1.equals(s2)) {
            logger.info("对象sb1与sb2的内容相同！！！");
        } else {
            logger.info("对象sb1与sb2的内容不相同！！！");
        }
    }

}
