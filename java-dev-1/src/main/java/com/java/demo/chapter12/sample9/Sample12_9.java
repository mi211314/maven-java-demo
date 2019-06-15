package com.java.demo.chapter12.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @Description: Sample12_9
 *
 * @Date: 2019/3/26 21:38
 */
public class Sample12_9 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12_9.class);

    public static void main(String[] args) throws IOException {
        try {
            ServerSocket ss = new ServerSocket(9999);
        } catch (IOException e) {
            throw e;
        }
    }

}
