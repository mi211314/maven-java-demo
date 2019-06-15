package com.java.demo.chapter6.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample3
 *
 * @Date: 2018/10/14 23:31
 */
public class Sample3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample3.class);

    private String stringMember;

    public static void main(String[] args) {
        Sample3 ref = new Sample3();
        logger.info("stringMember={}", ref.stringMember);
    }

}
