package com.java.demo.chapter14.sample23;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Description: Sample14_23
 * @Date: 2019/5/3 11:01
 */
public class Sample14_23 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_23.class);

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            al.add((int) (Math.random() * 100));
        }
        logger.info("这里是排序之前ArrayList中的元素：{}", al);
        Collections.sort(al);
        logger.info("这里是排序之后ArrayList中的元素：{}", al);
        Collections.sort(al, new MyComparator());
        logger.info("这里是使用比较器排序之后ArrayList中的元素：{}", al);
    }

}
