package com.java.demo.chapter18.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample18_3
 * @Author: miaolei
 * @Date: 2019/6/15 10:11
 */
public class Sample18_3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample18_3.class);

    public static void main(String[] args) {
        logger.info("=======创建一个CallBack对象并使其成为垃圾========");
        new CallBack();
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
        CallBack.help.show();
        logger.info("=======创建一个Common对象并使其成为垃圾========");
        new Common();
        logger.info("==========再次使CallBack对象成为垃圾===========");
        CallBack.help = null;
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
        CallBack.help.show();
    }

}
