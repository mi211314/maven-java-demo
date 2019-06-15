package com.java.demo.chapter7.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: PackageDemo
 *
 * @Date: 2018/11/20 07:15
 */
public class PackageDemo {

    private static final Logger logger = LoggerFactory.getLogger(PackageDemo.class);

    public PackageDemo(String s) {
        if (s == null || "".equals(s)) {
            logger.info("Package Demo");
        } else {
            logger.info("s={}", s);
        }
    }

    public static void main(String[] args) {
        PackageDemo demo = new PackageDemo(null);
        logger.info("demo={}", demo);
    }

}
