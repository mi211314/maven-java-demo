package com.java.demo.chapter17.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: Sample17_10
 * @Author: miaolei
 * @Date: 2019/6/4 07:30
 */
public class Sample17_10 {

    private static final Logger logger = LoggerFactory.getLogger(Sample17_10.class);

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(String.valueOf(i));
        }
        logger.info("队列中的元素为：");
        String value = queue.poll();
        while (value != null) {
            logger.info("[{}]", value);
            value = queue.poll();
        }
    }

}
