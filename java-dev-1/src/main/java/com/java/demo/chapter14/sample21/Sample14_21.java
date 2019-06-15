package com.java.demo.chapter14.sample21;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Description: Sample14_21
 * @Date: 2019/5/3 10:43
 */
public class Sample14_21 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_21.class);

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            al.add(i);
        }
        logger.info("ArrayList中元素的初始顺序：{}", al);
        for (int i = 0; i < 50; i++) {
            s.push(al.get(i));
        }
        for (int i = 0; i < 50; i++) {
            al.set(i, s.pop());
        }
        logger.info("使用过栈后，ArrayList中元素的顺序：{}", al);
    }

}
