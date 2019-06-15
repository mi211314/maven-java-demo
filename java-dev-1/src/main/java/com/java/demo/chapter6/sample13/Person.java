package com.java.demo.chapter6.sample13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Person
 *
 * @Date: 2018/10/29 21:19
 */
public class Person {

    private static final Logger logger = LoggerFactory.getLogger(Person.class);

    int age = 23;

    String name = "Tom";

    void showAge() {
        logger.info("My name is {}, and my age is {}.", age, name);
    }

}
