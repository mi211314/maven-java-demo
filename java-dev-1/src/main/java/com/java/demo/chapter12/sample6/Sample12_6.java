package com.java.demo.chapter12.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @Description: Sample12_6
 *
 * @Date: 2019/3/26 21:24
 */
public class Sample12_6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12_6.class);

    public static void main(String[] args) {
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(9999);
        } catch (IOException e) {
            logger.error("{}", e.getMessage(), e);
        } finally {
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    logger.error("{}", e.getMessage(), e);
                }
            }
        }
    }

}
