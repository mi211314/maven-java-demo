package com.java.demo.chapter7.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: DefaultPackageDemo
 *
 * @Date: 2018/11/20 07:19
 */
public class DefaultPackageDemo {

    private static final Logger logger = LoggerFactory.getLogger(DefaultPackageDemo.class);

    public static void main(String[] args) {
        PackageDemo demo = new PackageDemo("Default Package Import Demo");
        logger.info("demo={}", demo);

    }

}
