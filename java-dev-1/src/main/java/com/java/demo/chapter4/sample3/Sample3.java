package com.java.demo.chapter4.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample3
 *
 * @Date: 2018/9/5 22:02
 */
public class Sample3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample3.class);

    public static void main(String[] args) {
        int a = 1;
        switch (a) {
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
                logger.info("这是default");
        }
        a = 4;
        switch (a) {
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
                logger.info("这是default");
                break;
        }
    }

}
