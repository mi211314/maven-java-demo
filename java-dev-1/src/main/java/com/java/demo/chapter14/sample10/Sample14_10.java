package com.java.demo.chapter14.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashSet;

/**
 * @Description: Sample14_10
 * @Date: 2019/4/23 07:12
 */
public class Sample14_10 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_10.class);

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add(String.valueOf(5));
        lhs.add(String.valueOf(1));
        lhs.add(String.valueOf(3));
        lhs.add(String.valueOf(2));
        lhs.add(String.valueOf(4));
        lhs.remove(String.valueOf(5));
        lhs.add(null);
        logger.info("这里是LinkedHashSet操作后的结果：{}", lhs);
    }

}
