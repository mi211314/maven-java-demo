package com.java.demo.chapter15.sample10;

/**
 * @Description: Sample15_10
 * @Date: 2019/5/3 16:02
 */
public class Sample15_10 {

    public static void main(String[] args) {
        Outter.Inner i = new Outter.Inner();
        i.show();
        new Outter().getInner();
    }

}
