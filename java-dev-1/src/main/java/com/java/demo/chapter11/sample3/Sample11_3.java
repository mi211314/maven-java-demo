package com.java.demo.chapter11.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_3
 *
 * @Date: 2019/2/14 21:39
 */
public class Sample11_3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11_3.class);

    public static void main(String[] args) {
        boolean b = true;
        String s = String.valueOf(b);
        logger.info("boolean转换为String = {}", s);
        char c = 'A';
        s = String.valueOf(c);
        logger.info("char转换为String = {}", s);
        char[] cs = new char[] {'A', 'b', 'E', 'H'};
        s = String.valueOf(cs);
        logger.info("char[]转换为String = {}", s);
        s = String.valueOf(cs, 1, 2);
        logger.info("char[]转换为String = {}", s);
        double d = -43.325;
        s = String.valueOf(d);
        logger.info("double转换为String = {}", s);
        float f = 23.4F;
        s = String.valueOf(f);
        logger.info("float转换为String = {}", s);
        int i = -32443;
        s = String.valueOf(i);
        logger.info("int转换为String = {}", s);
        long l = 3274862428322323332L;
        s = String.valueOf(l);
        logger.info("long转换为String = {}", s);
    }

}
