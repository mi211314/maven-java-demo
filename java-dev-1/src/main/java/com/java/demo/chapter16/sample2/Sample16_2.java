package com.java.demo.chapter16.sample2;

/**
 * @Description: Sample16_2
 * @Date: 2019/5/4 10:24
 */
public class Sample16_2 {

    public static void main(String[] args) {
        MyRunnable1 mr1 = new MyRunnable1();
        MyRunnable2 mr2 = new MyRunnable2();
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        t1.start();
        t2.start();
    }

}
