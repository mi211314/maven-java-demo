package com.java.demo.chapter13.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description: Sample13_11
 *
 * @Date: 2019/4/12 07:35
 */
public class Sample13_11 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13_11.class);

    public static void main(String[] args) {
        String patternStr = "(0?[1-9]|1[0-2]):([0-5]\\d)([a|p]m)";
        String matcherStr = "现在的时刻为10:51pm，这里的营业时间为：每天8:00am至5:30pm！！！";
        Pattern p = Pattern.compile(patternStr);
        Matcher m = p.matcher(matcherStr);
        StringBuffer sb = new StringBuffer();
        int count = 0;
        logger.info("初始字符串为：{}", matcherStr);
        while (m.find()) {
            StringBuilder temp = new StringBuilder();
            if (m.group(3).equals("am")) {
                temp.append(m.group(1)).append(":").append(m.group(2));
            } else {
                int time = Integer.parseInt(m.group(1));
                time = time + 12;
                temp.append(time).append(":").append(m.group(2));
            }
            m.appendReplacement(sb, temp.toString());
            logger.info("[{}]将{}替换为{}", ++count, m.group(0), temp.toString());
        }
        m.appendTail(sb);
        logger.info("最后的结果为：{}", sb.toString());
    }

}
