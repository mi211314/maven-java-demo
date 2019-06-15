package com.java.demo.chapter9.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample9_13
 *
 * @Date: 2018/12/23 15:58
 */
public class Sample9_13 {

    private static final Logger logger = LoggerFactory.getLogger(Sample9_13.class);

    public static void main(String[] args) {
        Son s = new Son();
        if (s instanceof Son) {
            logger.info("s指向的对象可以看作Son类型！！！");
        }
        if (s instanceof Father) {
            logger.info("s指向的对象可以看作Father类型！！！");
        }
        if (s instanceof ISon) {
            logger.info("s指向的对象可以看作ISon类型！！！");
        }
        if (s instanceof IFather) {
            logger.info("s指向的对象可以看作IFather类型！！！");
        }
    }

}
