package com.java.demo.chapter29.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @Description: Sample29_10
 * @Author: miaolei
 * @Date: 2019/7/1 22:50
 */
public class Sample29_10 {

    private static final Logger logger = LoggerFactory.getLogger(Sample29_10.class);

    public static void main(String[] args) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(reader);
            BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter("D:\\Development\\Projects\\file1.txt"));
            String in = null;
            while (!(in = bufferedReader.readLine()).equals("quit")) {
                bufferedWriter.write(in);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

}
