package com.java.demo.chapter17.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Description: Sample17_11
 * @Author: miaolei
 * @Date: 2019/6/4 07:41
 */
public class Sample17_11 {

    private static final Logger logger = LoggerFactory.getLogger(Sample17_11.class);

    public static void scanQueue(Queue<MyElement> queue) {
        MyElement me = queue.poll();
        while (me != null) {
            logger.info("{}", me);
            me = queue.poll();
        }
    }

    public static void main(String[] args) {
        SortedSet<MyElement> ss = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            ss.add(new MyElement((int) Math.round(Math.random() * 100), "第" + i + "个"));
        }
        Queue<MyElement> queue1 = new PriorityQueue<>(ss);
        logger.info("===========对第一个优先级队列访问==============");
        scanQueue(queue1);
        Queue<MyElement> queue2 = new PriorityQueue<>(10, new MyComparator());
        for (int i = 0; i < 10; i++) {
            queue2.offer(new MyElement((int)Math.round(Math.random() * 100), "第" + i + "个"));
        }
        logger.info("===========对第二个优先级队列访问==============");
        scanQueue(queue2);
    }

}
