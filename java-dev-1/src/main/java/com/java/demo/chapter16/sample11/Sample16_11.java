package com.java.demo.chapter16.sample11;

/**
 * @Description: Sample16_11
 * @Author: miaolei
 * @Date: 2019/5/13 23:11
 */
public class Sample16_11 {

    public static void main(String[] args) {
        String s1 = "tom";
        String s2 = "jerry";
        String s3 = "lucy";
        MyThread mt1 = new MyThread(s1, s2, "MT1");
        MyThread mt2 = new MyThread(s2, s3, "MT2");
        MyThread mt3 = new MyThread(s3, s1, "MT3");
        mt1.start();
        mt2.start();
        mt3.start();
    }

}
