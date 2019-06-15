package com.java.demo.chapter14.sample23;

import java.util.Comparator;

/**
 * @Description: MyComparator
 * @Date: 2019/5/3 11:02
 */
public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }

}
