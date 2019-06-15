package com.java.demo.chapter12.sample14;

/**
 * @Description: MyExceptionFromLowLevel
 *
 * @Date: 2019/4/8 21:56
 */
public class MyExceptionFromLowLevel extends Exception {

    public MyExceptionFromLowLevel() {

    }

    public MyExceptionFromLowLevel(String message) {
        super(message);
    }

}
