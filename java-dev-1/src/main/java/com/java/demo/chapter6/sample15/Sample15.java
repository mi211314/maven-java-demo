package com.java.demo.chapter6.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @Description: PackageDemo
 *
 * @Date: 2018/10/29 21:27
 */
public class Sample15 {

    private static final Logger logger = LoggerFactory.getLogger(Sample15.class);

    public static void main(String[] args) {
        Date now = new Date();
        int year = now.getYear() + 1900;
        int month = now.getMonth() + 1;
        int date = now.getDate();
        String day = "";
        switch (now.getDay()) {
            case 0:
                day = "星期天";
                break;
            case 1:
                day = "星期一";
                break;
            case 2:
                day = "星期二";
                break;
            case 3:
                day = "星期三";
                break;
            case 4:
                day = "星期四";
                break;
            case 5:
                day = "星期五";
                break;
            case 6:
                day = "星期六";
                break;
            default:
                break;
        }
        int hour = now.getHours();
        int temp = now.getMinutes();
        String min = temp < 10 ? "0" + temp : "" + temp;
        temp = now.getSeconds();
        String sec = temp < 10 ? "0" + temp : "" + temp;
        logger.info("现在的时刻为：{}年{}月{}日 {} {}点{}分{}秒",
                year, month, date, day, hour, min, sec);
    }

}
