package com.java.demo.chapter13.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample13_10
 *
 * @Date: 2019/4/12 07:12
 */
public class Sample13_10 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13_10.class);

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java7.0");
        logger.info("操作之前对象sb1的内容为：{}", sb);
        sb.append("核心技术大全").insert(4, "SE").delete(9, 15).reverse();
        logger.info("一系列操作之后对象sb1的内容为：{}", sb);
    }

}
