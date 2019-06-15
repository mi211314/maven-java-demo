package com.java.demo.chapter16.sample10;

/**
 * @Description: Sample16_10
 * @Author: miaolei
 * @Date: 2019/5/13 22:56
 */
public class Sample16_10 {

    public static void main(String[] args) {
        Object resource = new Object();
        MyThread mt1 = new MyThread(resource, "MT1");
        MyThread mt2 = new MyThread(resource, "MT2");
        mt1.start();
        mt2.start();
    }

}
