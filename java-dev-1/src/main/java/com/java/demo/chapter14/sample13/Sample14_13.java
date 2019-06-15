package com.java.demo.chapter14.sample13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.TreeSet;

/**
 * @Description: Sample14_13
 * @Date: 2019/4/23 07:39
 */
public class Sample14_13 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_13.class);

    public static void main(String[] args) {
        TreeSet<Student> ts1 = new TreeSet<>();
        TreeSet<Student> ts2 = new TreeSet<>(new AgeCompare());
        ts1.add(new Student("tom", 21, 97005));
        ts1.add(new Student("jerry", 19, 97003));
        ts1.add(new Student("lucy", 18, 97004));
        ts1.add(new Student("smith", 28, 97001));
        ts1.add(new Student("jc", 23, 97002));

        ts2.add(new Student("tom", 21, 97005));
        ts2.add(new Student("jerry", 19, 97003));
        ts2.add(new Student("lucy", 18, 97004));
        ts2.add(new Student("smith", 28, 97001));
        ts2.add(new Student("jc", 23, 97002));
        logger.info("==============================================");
        logger.info("这里的SortedSet是按班级号进行的排序：{}", ts1);
        logger.info("==============================================");
        logger.info("这里的SortedSet是按年龄进行的排序：{}", ts2);
    }

}
