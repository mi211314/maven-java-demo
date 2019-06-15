package com.java.demo.chapter15.sample14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Description: Sample15_14
 * @Date: 2019/5/3 17:12
 */
public class Sample15_14 {

    private static final Logger logger = LoggerFactory.getLogger(Sample15_14.class);

    public static void main(String[] args) {
        TreeSet<Student> ts1 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.age - o1.age;
            }
        });
        ts1.add(new Student("mm", 21, 97005));
        ts1.add(new Student("jerry", 19, 97003));
        ts1.add(new Student("lucy", 18, 97004));
        ts1.add(new Student("smith", 28, 97001));
        ts1.add(new Student("jc", 23, 97002));
        logger.info("这里的Sorted集是按年龄从大到小进行的排序：{}", ts1);
    }

}
