package com.java.demo.chapter12.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample12_8
 *
 * @Date: 2019/3/26 21:32
 */
public class Sample12_8 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12_8.class);

    public static void main(String[] args) {
        a();
        logger.info("恭喜你，调用方法成功，程序正常工作！！！");
    }

    private static void a() {
        try {
            b();
        } catch (RuntimeException e) {
            logger.error("异常在a方法被解决掉！！！");
        }
    }

    private static void b() {
        c();
    }

    private static void c() {
        int[] a = new int[3];
        a[4] = 12;
    }

}
