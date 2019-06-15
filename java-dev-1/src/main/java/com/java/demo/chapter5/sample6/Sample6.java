package com.java.demo.chapter5.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample6
 *
 * @Date: 2018/9/9 13:51
 */
public class Sample6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample6.class);

    public static void main(String[] args) {
        char[] copyF = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyT = new char[7];
        System.arraycopy(copyF, 2, copyT, 0, 7);
        logger.info("The dest array is:");
        for (int i = 0; i < copyT.length; i++) {
            logger.info("{}", copyT[i]);
        }
    }

}
