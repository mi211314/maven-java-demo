package com.java.demo.chapter16.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: BreadContainer
 * @Author: miaolei
 * @Date: 2019/5/13 22:25
 */
public class BreadContainer {

    private static final Logger logger = LoggerFactory.getLogger(BreadContainer.class);

    private static final int maxNum = 300;

    private int num;

    public BreadContainer() {

    }

    public BreadContainer(int num) {
        this.num = num;
    }

    public synchronized void produceBread(int produceNum, String producerName) {
        while (num + produceNum > maxNum) {
            logger.info("{}要生产{}个，当前{}个，资源充足，不需要生产，{}去等待！！！",
                    producerName, produceNum, num, producerName);
            try {
                wait();
            } catch (InterruptedException e) {
                logger.error(e.getMessage(), e);
            }
        }
        num = num + produceNum;
        logger.info("{}生产了{}个，现在有{}个。", producerName, produceNum, num);
        notifyAll();
    }

    public synchronized void consumeBread(int consumeNum, String consumerName) {
        while (consumeNum > num) {
            logger.info("{}要消费{}个，由于现在只有{}个，{}于是去等待！！！",
                    consumerName, consumeNum, num, consumerName);
            try {
                wait();
            } catch (InterruptedException e) {
                logger.error(e.getMessage(), e);
            }
        }
        num = num - consumeNum;
        logger.info("{}要消费{}个，现在还剩{}个", consumerName, consumeNum, num);
        notifyAll();
    }

}
