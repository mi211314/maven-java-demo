package com.java.demo.chapter14.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample14_2
 *
 * @Date: 2019/4/14 15:08
 */
public class Sample14_2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_2.class);

    public static void main(String[] args) {
        Student s1 = new Student("jc", 21, 97001);
        Student s2 = new Student("jc", 21, 97001);
        if (s1.equals(s2)) {
            logger.info("学生对象s1与s2是相同的！！！");
        } else {
            logger.info("学生对象s1与s2是不相同的！！！");
        }
    }

}
