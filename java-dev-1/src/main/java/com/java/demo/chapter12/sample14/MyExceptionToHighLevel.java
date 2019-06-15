package com.java.demo.chapter12.sample14;

/**
 * @Description: MyExceptionToHighLevel
 *
 * @Date: 2019/4/8 21:55
 */
public class MyExceptionToHighLevel extends Exception {

    public MyExceptionToHighLevel() {

    }

    public MyExceptionToHighLevel(String message) {
        super(message);
    }

}
