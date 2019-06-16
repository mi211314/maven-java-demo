package com.java.demo.chapter28.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Description: Sample28_5
 * @Author: miaolei
 * @Date: 2019/6/16 13:45
 */
public class Sample28_5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample28_5.class);

    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            byte[] buffer = new byte[256];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket = new DatagramSocket(3000);
            socket.receive(packet);
            String info = new String (packet.getData());
            logger.info("{}", info);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }

}
