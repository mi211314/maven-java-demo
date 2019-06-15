package com.java.demo.chapter10.sample15;

import com.java.demo.chapter10.sample14.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample10_15
 *
 * @Date: 2019/1/19 12:20
 */
public class Sample10_15 {

    private static final Logger logger = LoggerFactory.getLogger(Sample10_15.class);

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2) {
            logger.info("两个引用指向同一个对象！！！");
        } else {
            logger.info("两个引用指向不同的对象！！！");
        }
    }

}
