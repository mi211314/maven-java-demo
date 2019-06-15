package com.java.demo.chapter14.sample14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Description: Sample14_14
 * @Date: 2019/4/29 07:06
 */
public class Sample14_14 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_14.class);

    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student("tom", 21, 97005));
        hs.add(new Student("jerry", 19, 97003));
        hs.add(new Student("lucy", 18, 97004));
        logger.info("这里是HashSet操作前的内容：{}", hs);
        Iterator<Student> it = hs.iterator();
        while (it.hasNext()) {
            Student temp = it.next();
            temp.setClassNum(2003001);
        }
        logger.info("这里是HashSet操作后的内容：{}", hs);
    }

}
