package com.java.demo.chapter15.sample16;

/**
 * @Description: OuterInterface
 * @Date: 2019/5/3 17:36
 */
public interface OuterInterface {

    interface InnerInterface {
        void inShow();
    }

    void outShow();

}
