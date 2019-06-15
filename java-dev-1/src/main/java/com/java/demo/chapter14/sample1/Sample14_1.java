package com.java.demo.chapter14.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample14_1
 *
 * @Date: 2019/4/14 15:03
 */
public class Sample14_1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_1.class);

    public static void main(String[] args) {
        Object tom = new Student("jc", 21, 97001);
        logger.info("{}", tom.toString());
        logger.info("{}", tom);
    }

}
