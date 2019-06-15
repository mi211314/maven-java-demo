package com.java.demo.chapter12.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample12_11
 *
 * @Date: 2019/3/26 21:47
 */
public class Sample12_11 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12_11.class);

    public static void main(String[] args) throws Exception {
        Father f = new Son();
        f.myFunction();
    }

}
