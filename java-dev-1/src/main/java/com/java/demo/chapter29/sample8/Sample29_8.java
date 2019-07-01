package com.java.demo.chapter29.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @Description: Sample29_8
 * @Author: miaolei
 * @Date: 2019/7/1 22:32
 */
public class Sample29_8 {

    private static final Logger logger = LoggerFactory.getLogger(Sample29_8.class);

    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("D:\\Development\\Projects\\file1.txt");
            InputStreamReader reader = new InputStreamReader(in);
            FileOutputStream out = new FileOutputStream("D:\\Development\\Projects\\file2.txt");
            OutputStreamWriter writer = new OutputStreamWriter(out);
            int ch = 0;
            while ((ch = reader.read()) != -1) {
                logger.info("ch={}", (char)ch);
                writer.write(ch);
            }
            reader.close();
            writer.close();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

}
