package com.java.demo.chapter16.sample1;

/**
 * @Description: Sample16_1
 * @Date: 2019/5/4 10:13
 */
public class Sample16_1 {

    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
    }

}
