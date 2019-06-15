package com.java.demo.chapter7.sample14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: PackageDemo
 *
 * @Date: 2018/11/18 22:18
 */
public class PackageDemo {

    private static final Logger logger = LoggerFactory.getLogger(PackageDemo.class);

    public PackageDemo() {
        logger.info("Package Demo");
    }

    public static void main(String[] args) {
        PackageDemo demo = new PackageDemo();
        logger.info("demo={}", demo);
    }

}
