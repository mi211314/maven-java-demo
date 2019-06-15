package com.java.demo.chapter15.sample2;

/**
 * @Description: Sample15_2
 * @Date: 2019/5/3 15:24
 */
public class Sample15_2 {

    public static void main(String[] args) {
        Outter o = new Outter();
        Outter.Inner i = o.new Inner();
        i.show();
    }

}
