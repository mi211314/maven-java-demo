package com.java.demo.chapter15.sample16;

/**
 * @Description:
 * @Date: 2019/5/3 17:36
 */
public class Sample15_16 {

    public static void main(String[] args) {
        OuterInterface.InnerInterface iic = new InnerInterfaceImpl();
        OuterInterface oic = new OuterInterfaceImpl();
        iic.inShow();
        oic.outShow();
    }

}
