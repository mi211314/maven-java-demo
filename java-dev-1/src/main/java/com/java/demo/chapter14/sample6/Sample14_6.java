package com.java.demo.chapter14.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;

/**
 * @Description: Sample14_6
 * @Date: 2019/4/22 07:40
 */
public class Sample14_6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_6.class);

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            ll.add(String.valueOf(i));
        }
        for (int i = 15; i < 30; i++) {
            ll.add(i, String.valueOf(30 - i + 15));
        }
        logger.info("这里是LinkedList操作后的结果：{}", ll);
    }

}
