package com.java.demo.chapter14.sample13;

import java.util.Comparator;

/**
 * @Description: AgeCompare
 * @Date: 2019/4/23 07:42
 */
public class AgeCompare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }

}
