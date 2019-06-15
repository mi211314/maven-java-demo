package com.java.demo.chapter15.sample15;

/**
 * @Description: Sample15_15
 * @Date: 2019/5/3 17:26
 */
public class Sample15_15 {

    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerInterface ic;
        ic = oc.getIn();
        ic.show();
        ic = new Common();
        ic.show();
    }

}
