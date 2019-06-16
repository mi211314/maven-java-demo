package com.java.demo.chapter28.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description: Sample28_6
 * @Author: miaolei
 * @Date: 2019/6/16 13:56
 */
public class Sample28_6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample28_6.class);

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.baidu.com:80/Java_Docs/html/zh_CN/api/overview.html");
            logger.info("协议名称：{}", url.getProtocol());
            logger.info("端口号：{}", url.getPort());
            logger.info("主机名：{}", url.getHost());
            logger.info("文件名：{}", url.getFile());
            logger.info("文件路径：{}", url.getPath());
            logger.info("URL对象的字符串表示形式：{}", url.toExternalForm());
        } catch (MalformedURLException e) {
            logger.error(e.getMessage(), e);
        }
    }

}
