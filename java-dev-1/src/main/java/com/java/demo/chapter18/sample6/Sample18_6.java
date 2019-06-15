package com.java.demo.chapter18.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample18_6
 * @Author: miaolei
 * @Date: 2019/6/15 10:36
 */
public class Sample18_6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample18_6.class);

    public static void main(String[] args) {
        RubbishThread rt1 = new RubbishThread("孤岛中的rt1线程");
        RubbishThread rt2 = new RubbishThread("孤岛中的rt2线程");
        RubbishThread rt3 = new RubbishThread("孤岛中的rt3线程");
        rt1.brother = rt2;
        rt2.brother = rt3;
        rt3.brother = rt1;
        rt1.start();
        rt1 = null;
        rt2 = null;
        rt3 = null;
        logger.info("=======对无引用但或者的线程进行垃圾收集=========");
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
        logger.info("==========对无引用并死亡的线程进行垃圾收集==========");
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
    }

}
