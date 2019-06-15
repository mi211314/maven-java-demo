package com.java.demo.chapter10.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample10_9
 *
 * @Date: 2019/1/17 17:41
 */
public class Sample10_9 {

    private static final Logger logger = LoggerFactory.getLogger(Sample10_9.class);

    public static void main(String[] args) {
        new Animal();
       Animal a = new Animal("有参构造器");
       String name = a.getName();
       logger.info("name = {}", name);
    }

}
