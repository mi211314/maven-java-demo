package com.java.demo.chapter14.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

/**
 * @Description: Sample14_8
 * @Date: 2019/4/22 07:49
 */
public class Sample14_8 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_8.class);

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add(String.valueOf(5));
        hs.add(String.valueOf(1));
        hs.add(String.valueOf(3));
        hs.add(String.valueOf(2));
        hs.add(String .valueOf(4));
        hs.remove(String.valueOf(5));
        hs.add(String.valueOf(1));
        hs.add(null);
        logger.info("这里是HashSet操作后的结果：{}", hs);
    }

}
