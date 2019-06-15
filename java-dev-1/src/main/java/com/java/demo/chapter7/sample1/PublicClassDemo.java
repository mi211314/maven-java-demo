package com.java.demo.chapter7.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: PublicClassDemo
 *
 * @Date: 2018/10/29 22:23
 */
public class PublicClassDemo {

    private static final Logger logger = LoggerFactory.getLogger(PublicClassDemo.class);

    public static void main(String[] args) {
        PublicClass pc = new PublicClass("Public Class Demo");
        String name = pc.getName();
        logger.info(name);
    }

}
