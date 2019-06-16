package com.java.demo.chapter28.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * @Description: Sample28_7
 * @Author: miaolei
 * @Date: 2019/6/16 14:04
 */
public class Sample28_7 {

    private static final Logger logger = LoggerFactory.getLogger(Sample28_7.class);

    public static void main(String[] args) {
        try {
            URL url = new URL("http://baijiahao.baidu.com/s?id=1636447914035023917");
            URLConnection connection = url.openConnection();
            logger.info("{}", connection.getContentType());
            logger.info("{}", connection.getContentLength());
            Date date = new Date(connection.getLastModified());
            logger.info("{}月{}日{}点{}分{}秒",
                    date.getMonth(), date.getDay(), date.getHours(),
                    date.getMinutes(), date.getSeconds());
            logger.info("{}", connection.getExpiration());
            logger.info("{}", connection.getHeaderField(1));
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }

}
