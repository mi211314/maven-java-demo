package com.java.demo.chapter14.sample15;

/**
 * @Description: MyEntryForEach
 * @Date: 2019/4/29 07:16
 */
public class MyEntryForEach {

    private int intMember;

    public MyEntryForEach() {

    }

    public MyEntryForEach(int intMember) {
        this.intMember = intMember;
    }

    public void setIntMember(int intMember) {
        this.intMember = intMember;
    }

    @Override
    public String toString() {
        return "MyEntryForEach{" +
                "intMember=" + intMember +
                '}';
    }

}
