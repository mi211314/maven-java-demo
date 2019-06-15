package com.java.demo.chapter12.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @Description: Sample12_10
 *
 * @Date: 2019/3/26 21:42
 */
public class Sample12_10 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12_10.class);

    public static void main(String[] args) {
        try {
            myFunction();
        } catch (IOException e) {
            logger.error("{}", e.getMessage(), e);
        }
        logger.info("恭喜你，程序正常运行结束！！！");
    }

    public static void myFunction() throws IOException {
        ServerSocket ss = new ServerSocket(9999);
    }

}
