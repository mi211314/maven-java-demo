package com.java.demo.chapter28.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: Sample28_3
 * @Author: miaolei
 * @Date: 2019/6/16 13:20
 */
public class Sample28_3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample28_3.class);

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        DataOutputStream output = null;
        try {
            serverSocket = new ServerSocket(3000);
            socket = serverSocket.accept();
            String info = "客户端已连接！！！";
            output = new DataOutputStream(socket.getOutputStream());
            output.writeUTF(info);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
                if (socket != null) {
                    socket.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
    }

}
