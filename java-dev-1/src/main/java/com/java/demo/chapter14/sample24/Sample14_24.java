package com.java.demo.chapter14.sample24;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Description: Sample14_24
 * @Date: 2019/5/3 11:08
 */
public class Sample14_24 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_24.class);

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            al.add((int) (Math.random() * 100));
        }
        Collections.sort(al);
        logger.info("{}", al);
        int index = Collections.binarySearch(al, 20);
        if (index < 0) {
            logger.info("该列表中没有您需要找的整数，请您再次运行试试！！！");
        } else {
            logger.info("恭喜你，找到了您需要找的元素，其索引是：{}", index);
        }

    }

}
