package com.java.demo.chapter29.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Description: Sample29_4
 * @Author: miaolei
 * @Date: 2019/6/28 07:46
 */
public class Sample29_4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample29_4.class);

    public static void main(String[] args) {
        try {
            byte[] buffer = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream("D:\\Development\\Projects\\file1.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Development\\Projects\\file2.txt");
            logger.info("复制文件{}字节", fileInputStream.available());
            while (true) {
                if (fileInputStream.available() < 1024) {
                    int remain = -1;
                    while ((remain = fileInputStream.read()) != -1) {
                        fileOutputStream.write(remain);
                    }
                    break;
                } else {
                    fileInputStream.read(buffer);
                    fileOutputStream.write(buffer);
                }
            }
            fileInputStream.close();
            fileOutputStream.close();
            logger.info("复制完成");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

}
