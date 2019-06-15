package com.java.demo.chapter18.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample18_1
 * @Author: miaolei
 * @Date: 2019/6/15 09:56
 */
public class Sample18_1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample18_1.class);

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        logger.info("当前JVM使用的总内存量为：{}", rt.totalMemory());
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
        logger.info("创建100000000个垃圾对象前JVM中可使用的内存量为:{}", rt.freeMemory());
        for (int i = 0; i < 100000000; i++) {
            new String("Rubbish");
        }
        logger.info("创建100000000个垃圾对象后JVM中可使用的内存量为:{}", rt.freeMemory());
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
        logger.info("申请垃圾收集器运行后JVM中可使用的内存量为：{}", rt.freeMemory());
    }

}

