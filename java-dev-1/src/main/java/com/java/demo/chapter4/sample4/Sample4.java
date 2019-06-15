package com.java.demo.chapter4.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample4
 *
 * @Date: 2018/9/5 22:11
 */
public class Sample4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample4.class);

    public static void main(String[] args) {
        int a = 8;
        switch (a) {
            case 1:
            case 3:
            case 9:
                logger.info("情况1,3,9");
                break;
            case 2:
            case 4:
            case 5:
                logger.info("情况2,4,5");
                break;
            case 6:
            case 7:
            case 8:
                logger.info("情况6,7,8");
                break;
            default:
                logger.info("情况default");
                break;
        }
    }

}
