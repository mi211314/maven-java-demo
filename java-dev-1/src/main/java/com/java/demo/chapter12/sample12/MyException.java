package com.java.demo.chapter12.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyException
 *
 * @Date: 2019/3/26 21:58
 */
public class MyException extends Exception {

    private static final Logger logger = LoggerFactory.getLogger(MyException.class);

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        MyException me = new MyException("自定义异常类");
        logger.info("自定义异常对象的字符串表示为：{}。", me.toString());
        logger.info("自定义异常对象携带的出错信息为：{}。", me.getMessage());
    }

}
