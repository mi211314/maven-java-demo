package com.java.demo.chapter14.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * @Description: Sample4_4
 * @Author:
 * @Date: 2019/4/14 22:28
 */
public class Sample4_4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample4_4.class);

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            al.add(String.valueOf(i));
        }
        for (int i = 60; i < 75; i++) {
            al.set(i - 45, String.valueOf(i));
        }
        logger.info("这里是ArrayList操作后的结果：{}", al);
        String s = al.get(22);
        logger.info("索引为22的元素长度为：{}", s.length());
    }

}
