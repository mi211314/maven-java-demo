package com.java.demo.chapter14.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.TreeSet;

/**
 * @Description:
 * @Date: 2019/4/23 07:19
 */
public class Sample14_11 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_11.class);

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add(String.valueOf(5));
        ts.add(String.valueOf(6));
        ts.add(String.valueOf(3));
        ts.add(String.valueOf(2));
        ts.add(String.valueOf(4));
        ts.remove(String.valueOf(5));
        ts.add(String.valueOf(1));
        logger.info("这里是TreeSet操作后的结果：{}", ts);
    }

}
