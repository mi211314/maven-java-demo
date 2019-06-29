package com.java.demo.chapter29.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @Description: Sample29_3
 * @Author: miaolei
 * @Date: 2019/6/28 07:43
 */
public class Sample29_3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample29_3.class);

    public static void main(String[] args) {
        logger.info("请输入字符：");
        try {
            logger.info("输入字符十进制表示为：{}", System.in.read());
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }

}
