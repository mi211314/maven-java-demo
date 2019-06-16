package com.java.demo.chapter28.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Description: Sample28_1
 * @Author: miaolei
 * @Date: 2019/6/16 12:59
 */
public class Sample28_1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample28_1.class);

    public static void main(String[] args) throws UnknownHostException {
        InetAddress addr1, addr2;
        addr1 = InetAddress.getLocalHost();
        logger.info("{}", addr1);
        addr2 = InetAddress.getByName("www.baidu.com");
        logger.info("{}", addr2);
        InetAddress[] addr3 = InetAddress.getAllByName("www.sohu.com");
        for (int i = 0; i < addr3.length; i++) {
            logger.info("{}", addr3[i]);
        }
    }

}
