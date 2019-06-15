package com.java.demo.chapter9.sample5;

/**
 * @Description: MyMoniter
 *
 * @Date: 2018/12/23 15:43
 */
public class MyMoniter {

    private MyListener ml;

    public void regListener(MyListener ml) {
        this.ml = ml;
    }

    public void generalProcessEvent() {
        this.ml.specialProcessEvent();
    }

}
