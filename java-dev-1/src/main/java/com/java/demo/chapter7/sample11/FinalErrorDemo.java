package com.java.demo.chapter7.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Description: FinalErrorDemo
 *
 * @Date: 2018/11/18 21:37
 */
public class FinalErrorDemo {

    private static final Logger logger = LoggerFactory.getLogger(FinalErrorDemo.class);

    private final FileInputStream in;

    public FinalErrorDemo() {
        FileInputStream temp = null;
        try {
            temp = new FileInputStream("in.txt");
        } catch (FileNotFoundException e) {
            try {
                temp = new FileInputStream("error.txt");
            } catch (FileNotFoundException e1) {
                logger.error("{}", e1);
            }
        }
        in = temp;
    }

    public static void main(String[] args) {
        new FinalErrorDemo();
    }

}
