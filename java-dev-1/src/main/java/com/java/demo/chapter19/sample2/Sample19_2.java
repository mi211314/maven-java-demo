package com.java.demo.chapter19.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample19_2
 * @Author: miaolei
 * @Date: 2019/6/15 14:03
 */
public class Sample19_2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample19_2.class);

    private int[] queue;

    private int front;

    private int rear;

    private int queueSize;

    private int eleNum;

    public void initQueue(int size) {
        queue = new int[size];
        queueSize = size;
        front = 0;
        rear = -1;
        eleNum = 0;
    }

    public void insert(int data) {
        rear += 1;
        queue[rear] = data;
        eleNum++;
    }

    public int remove() {
        int removeData = queue[front];
        front += 1;
        if (front == queueSize) {
            front = 0;
        }
        eleNum--;
        return removeData;
    }

    public int frontData() {
        return queue[front];
    }

    public boolean isEmpty() {
        if (eleNum == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (eleNum == queueSize) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return eleNum;
    }

    public static void main(String[] args) {
        Sample19_2 sample19_2 = new Sample19_2();
        sample19_2.initQueue(10);

        sample19_2.insert(1);
        sample19_2.insert(100);
        sample19_2.insert(12);
        sample19_2.insert(13);
        sample19_2.insert(154);
        sample19_2.insert(112);
        sample19_2.insert(166);
        sample19_2.insert(8);
        sample19_2.insert(45);
        sample19_2.insert(67);

        int eleNum = sample19_2.size();
        logger.info("队列的大小为：{}", eleNum);
        while (!sample19_2.isEmpty()) {
            int data = sample19_2.remove();
            logger.info("{}", data);
        }
        if (sample19_2.isEmpty()) {
            logger.info("队列为空。");
        } else {
            logger.info("队列不为空。");
        }
    }

}
