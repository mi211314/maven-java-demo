package com.java.demo.chapter16.sample5;

/**
 * @Description: Sample16_5
 * @Date: 2019/5/4 17:21
 */
public class Sample16_5 {

    public static void main(String[] args) {
        MyRunnable mr1 = new MyRunnable("[", "]");
        MyRunnable mr2 = new MyRunnable("<", ">");
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        t1.start();
        t2.start();
    }

}
