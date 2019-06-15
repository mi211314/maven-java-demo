package com.java.demo.chapter14.sample22;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Description: Sample14_22
 * @Date: 2019/5/3 10:50
 */
public class Sample14_22 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_22.class);

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        String[] sa = {"1", "a", "2", "b", "3", "c", "4", "d"};
        StringBuilder sb = new StringBuilder();
        for (String str : sa) {
            sb.append(str).append(", ");
        }
        sb.setLength(sb.length() - 2);
        logger.info("数组中元素的初始顺序为：[{}]", sb.toString());
        for (String str : sa) {
            stack.push(str);
        }
        logger.info("数组中元素倒序后的结果为：{}", stack);
    }

}
