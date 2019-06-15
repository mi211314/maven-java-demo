package com.java.demo.chapter4.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample1
 *
 * @Date: 2018/9/4 23:43
 */
public class Sample1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample1.class);

    public static void main(String[] args) {
        int i = 3;
        switch (i) {
            case 1:
                logger.info("这是1");
                break;
            case 2:
                logger.info("这是2");
                break;
            case 3:
                logger.info("这是3");
                break;
            default:
                logger.info("1，2，3都不是");
                break;
        }
    }

}
