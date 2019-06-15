package com.java.demo.chapter18.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample18_5
 * @Author: miaolei
 * @Date: 2019/6/15 10:31
 */
public class Sample18_5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample18_5.class);

    public static void main(String[] args) {
        Rubbish r1 = new Rubbish("孤岛中的r1");
        Rubbish r2 = new Rubbish("孤岛中的r2");
        Rubbish r3 = new Rubbish("孤岛中的r3");
        r1.brother = r2;
        r2.brother = r3;
        r3.brother = r1;
        r1 = null;
        r2 = null;
        r3 = null;
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
    }

}
