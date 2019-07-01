package com.java.demo.chapter29.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @Description: Sample29_9
 * @Author: miaolei
 * @Date: 2019/7/1 22:43
 */
public class Sample29_9 {

    private static final Logger logger = LoggerFactory.getLogger(Sample29_9.class);

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("D:\\Development\\Projects\\file1.txt");
            FileWriter writer = new FileWriter("D:\\Development\\Projects\\file2.txt");
            int in = 0;
            while ((in = reader.read()) != -1) {
                writer.write(in);
            }
            reader.close();
            writer.close();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

}
