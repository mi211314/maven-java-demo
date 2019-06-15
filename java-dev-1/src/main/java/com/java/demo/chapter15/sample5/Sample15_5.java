package com.java.demo.chapter15.sample5;

/**
 * @Description: Sample15_5
 * @Date: 2019/5/3 15:39
 */
public class Sample15_5 {

    public static void main(String[] args) {
        Outter o = new Outter();
        Outter.Inner i = o.new Inner();
        i.show();
    }

}
