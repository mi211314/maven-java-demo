package com.java.demo.chapter16.sample9;

/**
 * @Description: Sample16_9
 * @Author: miaolei
 * @Date: 2019/5/13 22:40
 */
public class Sample16_9 {

    public static void main(String[] args) {
        BreadContainer bc = new BreadContainer(50);
        Producer p1 = new Producer(50, bc, "P1");
        Producer p2 = new Producer(200, bc, "P2");
        Producer p3 = new Producer(290, bc, "P3");
        Consumer c1 = new Consumer(70, bc, "C1");
        Consumer c2 = new Consumer(80, bc, "C2");
        c1.start();
        c2.start();
        p1.start();
        p2.start();
        p3.start();
    }

}
