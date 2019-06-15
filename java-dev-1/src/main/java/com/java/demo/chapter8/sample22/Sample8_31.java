package com.java.demo.chapter8.sample22;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_31
 *
 * @Date: 2018/12/16 21:08
 */
public class Sample8_31 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_31.class);

    public static void main(String[] args) {
        Audi_A6 a6 = new Audi_A6();
        a6.startUp();
        a6.turbo();
        Audi_A8 a8 = new Audi_A8();
        a8.startUp();
        a8.turbo();
    }

}
