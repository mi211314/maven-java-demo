package com.java.demo.chapter14.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Vector;

/**
 * @Description: Sample14_5
 * @Date: 2019/4/22 07:36
 */
public class Sample14_5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_5.class);

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        for (int i = 0; i < 50; i++) {
            v.add(String.valueOf(i));
        }
        for (int i = 50; i < 100; i++) {
            v.add(String.valueOf(99 - i + 50));
        }
        logger.info("这里是Vector操作后的结果：{}", v);
    }

}
