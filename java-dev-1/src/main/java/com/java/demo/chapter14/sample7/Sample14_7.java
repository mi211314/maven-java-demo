package com.java.demo.chapter14.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: Sample14_7
 * @Date: 2019/4/22 07:45
 */
public class Sample14_7 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_7.class);

    public static void main(String[] args) {
        String[] s = {"tom", "jerry", "lucy", "jc"};
        List<String> l = Arrays.asList(s);
        logger.info("这是将字符串数组转换为列表后的结果：{}", l);
    }

}
