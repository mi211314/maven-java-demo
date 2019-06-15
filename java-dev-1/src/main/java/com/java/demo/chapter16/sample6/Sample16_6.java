package com.java.demo.chapter16.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample16_6
 * @Date: 2019/5/4 17:26
 */
public class Sample16_6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample16_6.class);

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        for (int i = 0; i < 30; i++) {
            if (i == 10) {
                logger.info("{使用了join方法}");
                try {
                    t.join();
                } catch (InterruptedException e) {
                    logger.info("子线程异常", e);
                }
            }
            logger.info("<{}>", i);
        }
    }

}
