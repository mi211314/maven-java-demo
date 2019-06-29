package com.java.demo.chapter29.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @Description: Sample29_5
 * @Author: miaolei
 * @Date: 2019/6/28 21:33
 */
public class Sample29_5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample29_5.class);

    public static void main(String[] args) {
        try {
            byte[] data = new byte[1];
            File srcFile = new File("D:\\Development\\Projects\\file3.txt");
            File desFile = new File("D:\\Development\\Projects\\file4.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFile));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(desFile));
            logger.info("复制文件：{}字节", srcFile.length());
            while (bufferedInputStream.read(data) != -1) {
                bufferedOutputStream.write(data);
            }
            bufferedOutputStream.flush();
            bufferedInputStream.close();
            bufferedOutputStream.close();
        } catch (Exception e) {
            logger.info(e.getMessage(), e);
        }
    }

}
