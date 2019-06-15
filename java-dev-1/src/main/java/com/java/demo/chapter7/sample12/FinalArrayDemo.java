package com.java.demo.chapter7.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: FinalArrayDemo
 *
 * @Date: 2018/11/18 21:48
 */
public class FinalArrayDemo {

    private static final Logger logger = LoggerFactory.getLogger(FinalArrayDemo.class);

    private final String[] names;

    public FinalArrayDemo() {
        names = new String[] {"Jack", "Mike", "Tom"};
    }

    public void printArray() {
        for(int i = 0; i < names.length; i++) {
            logger.info("[i]:{}", names[i]);
        }
    }

    public void changeArray() {
        names[0] = "Jerry";
        names[1] = "Michael";
        names[2] = "John";
    }

    public static void main(String[] args) {
        FinalArrayDemo demo = new FinalArrayDemo();
        demo.printArray();
        demo.changeArray();
        demo.printArray();
    }

}
