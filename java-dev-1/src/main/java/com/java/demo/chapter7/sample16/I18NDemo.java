package com.java.demo.chapter7.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ResourceBundle;

/**
 * @Description: I18NDemo
 *
 * @Date: 2018/11/20 07:26
 */
public class I18NDemo {

    private static final Logger logger = LoggerFactory.getLogger(I18NDemo.class);

    private static ResourceBundle I18N = ResourceBundle.getBundle("package");

    public static void main(String[] args) {
        String s = I18N.getString("desc");
        logger.info("I18N desc:{}", s);
    }

}
