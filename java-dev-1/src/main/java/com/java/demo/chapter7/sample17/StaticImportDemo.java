package com.java.demo.chapter7.sample17;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: StaticImportDemo
 *
 * @Date: 2018/11/24 21:26
 */
public class StaticImportDemo {

    private static final Logger logger = LoggerFactory.getLogger(StaticImportDemo.class);

    private double r;

    public StaticImportDemo(double r) {
        this.r = r;
    }

    public static void main(String[] args) {
        StaticImportDemo demo = new StaticImportDemo(0.24);
        double d = Math.cos(Math.PI * demo.r);
        logger.info("d={}", d);
    }

}
