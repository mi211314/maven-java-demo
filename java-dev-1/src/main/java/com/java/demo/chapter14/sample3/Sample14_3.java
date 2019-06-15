package com.java.demo.chapter14.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample14_3
 * @Author:
 * @Date: 2019/4/14 22:02
 */
public class Sample14_3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_3.class);

    public static void main(String[] args) {
        Student s1 = new Student("jc", 21, 97001);
        Student s2 = new Student("jc", 21, 97001);
        if (s1.equals(s2)) {
            logger.info("学生对象s1与s2是等价的，其哈希码分别为：\r\ns1.hashCode()={},s2.hashCode()={}",
                    s1.hashCode(), s2.hashCode());
        } else {
            logger.info("学生对象s1与s2是不等价的！！！");
        }
    }

}
