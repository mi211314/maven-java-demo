package com.java.demo.chapter19.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample19_1
 * @Author: miaolei
 * @Date: 2019/6/15 13:50
 */
public class Sample19_1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample19_1.class);

    private int[] arrayStack;

    private int stackSize;

    private int top;

    public void initStack(int size) {
        stackSize = size;
        arrayStack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        int curTop = stackSize - 1;
        if (top == curTop) {
            return true;
        } else {
            return false;
        }
    }

    public void pushStack(int data) {
        top += 1;
        arrayStack[top] = data;
    }

    public int popStack() {
        int popData = arrayStack[top];
        top -= 1;
        return popData;
    }

    public int topStack() {
        return arrayStack[top];
    }

    public void destoryStack() {
        arrayStack = null;
    }

    public static void main(String[] args) {
        Sample19_1 sample19_1 = new Sample19_1();
        int topData;
        sample19_1.initStack(10);

        sample19_1.pushStack(1);
        sample19_1.pushStack(2);
        sample19_1.pushStack(5);
        sample19_1.pushStack(7);
        sample19_1.pushStack(100);
        sample19_1.pushStack(121);
        sample19_1.pushStack(113);
        sample19_1.pushStack(109);
        sample19_1.pushStack(12);
        sample19_1.pushStack(11);
        if (sample19_1.isFull()) {
            logger.info("栈是满的。");
        } else {
            logger.info("栈不是满的。");
        }
        topData = sample19_1.topStack();
        logger.info("栈顶的数据为：{}", topData);
        logger.info("栈中所有的数据为:");
        while (!sample19_1.isEmpty()) {
            int data = sample19_1.popStack();
            logger.info("{}", data);
        }
        logger.info("{}", sample19_1.isEmpty());
    }

}
