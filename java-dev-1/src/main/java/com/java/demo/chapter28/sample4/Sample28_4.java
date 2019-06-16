package com.java.demo.chapter28.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Description:
 * @Author: miaolei
 * @Date: 2019/6/16 13:34
 */
public class Sample28_4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample28_4.class);

    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            InetAddress addr = InetAddress.getLocalHost();
            byte[] info = "UDP协议数据报包".getBytes();
            DatagramPacket packet = new DatagramPacket(info, info.length, addr, 3000);
            socket = new DatagramSocket();
            socket.send(packet);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }

}
