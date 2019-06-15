package com.java.demo.chapter17.sample11;

import java.util.Comparator;

/**
 * @Description: MyComparator
 * @Author: miaolei
 * @Date: 2019/6/4 07:40
 */
public class MyComparator implements Comparator<MyElement> {

    @Override
    public int compare(MyElement o1, MyElement o2) {
        return o2.priority - o1.priority;
    }

}
