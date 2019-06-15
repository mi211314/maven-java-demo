package com.java.demo.chapter4.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample2
 *
 * @Date: 2018/9/4 23:49
 */
public class Sample2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample2.class);

    public static void main(String[] args) {
        LightColor lc = LightColor.RED;
        switch (lc) {
            case RED:
                logger.info("亮红灯");
                break;
            case YELLOW:
                logger.info("亮黄灯");
                break;
            case GREEN:
                logger.info("亮绿灯");
                break;
            default:
                logger.info("这是默认语句");
                break;
        }
    }

}
