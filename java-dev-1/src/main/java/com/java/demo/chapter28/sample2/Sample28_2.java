package com.java.demo.chapter28.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Description: Sample28_2
 * @Author: miaolei
 * @Date: 2019/6/16 13:12
 */
public class Sample28_2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample28_2.class);

    public static void main(String[] args) {
        Socket client = null;
        DataInputStream input = null;
        try {
            client = new Socket(InetAddress.getLocalHost(), 3000);
            input = new DataInputStream(client.getInputStream());
            String info = input.readUTF();
            logger.info("{}", info);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                if (client != null) {
                    client.close();
                }
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
    }

}
