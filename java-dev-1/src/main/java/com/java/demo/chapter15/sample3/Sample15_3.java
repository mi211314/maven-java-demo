package com.java.demo.chapter15.sample3;

/**
 * @Description: Sample15_3
 * @Date: 2019/5/3 15:29
 */
public class Sample15_3 {

    public static void main(String[] args) {
        Outter o = new Outter();
        Outter.Inner i = o.new Inner();
        i.show();
    }

}
