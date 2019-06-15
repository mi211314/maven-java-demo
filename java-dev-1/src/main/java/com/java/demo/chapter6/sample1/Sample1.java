package com.java.demo.chapter6.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample1
 *
 * @Date: 2018/10/14 22:53
 */
public class Sample1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample1.class);

    public static void main(String[] args) {
        Student tom = new Student();
        Student jerry = new Student();

        tom.age = 21;
        tom.name = "Tome";
        tom.sclass = "97402";

        jerry.age = 23;
        jerry.name = "Jerry";
        jerry.sclass = "97403";

        logger.info("tom: name={}, age={}, class={}", tom.name, tom.age, tom.sclass);
        logger.info("jerry: name={}, age={}, sclass={}", jerry.name, jerry.age, jerry.sclass);
    }

}
