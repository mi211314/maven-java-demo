package com.java.demo.chapter16.sample4;

/**
 * @Description: Sample16_4
 * @Date: 2019/5/4 17:10
 */
public class Sample16_4 {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }

}
