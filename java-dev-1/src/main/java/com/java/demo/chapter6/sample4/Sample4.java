package com.java.demo.chapter6.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample4
 *
 * @Date: 2018/10/14 23:39
 */
public class Sample4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample4.class);

    private int intMember = 66;

    public static void main(String[] args) {
        Sample4 ref1 = new Sample4();
        Sample4 ref2 = new Sample4();
        logger.info("ref1.intMember={}, ref2.intMember={}", ref1.intMember, ref2.intMember);
        if (ref1 == ref2) {
            logger.info("ref1与ref2指向同一个对象。");
        } else {
            logger.info("ref1与ref2不是指向同一个对象。");
        }
        ref1 = ref2;
        if (ref1 == ref2)  {
            logger.info("ref1与ref2指向同一个对象。");
        } else {
            logger.info("ref1与ref2不是指向同一个对象。");
        }

    }

}
