package com.java.demo.chapter7.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: ClassInfo
 *
 * @Date: 2018/11/11 23:08
 */
public class ClassInfo {

    private static  final Logger logger = LoggerFactory.getLogger(ClassInfo.class);

    private static int number;

    private static final String classDesc;

    static {
        classDesc = "班级描述";
    }

    public ClassInfo() {
        number++;
    }

    public void showNumber() {
        logger.info("number = {}", number);
    }

    public void showClassDesc() {
        logger.info("classDesc = {}", classDesc);
    }

    public static void main(String[] args) {
        ClassInfo classInfo = new ClassInfo();
        classInfo.showNumber();
        classInfo.showClassDesc();
    }

}
