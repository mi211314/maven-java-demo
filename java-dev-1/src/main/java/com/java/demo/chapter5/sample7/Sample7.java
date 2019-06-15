package com.java.demo.chapter5.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample7
 *
 * @Date: 2018/9/16 12:46
 */
public class Sample7 {

    private static final Logger logger = LoggerFactory.getLogger(Sample7.class);

    public static void main(String[] args) {
        String[][] list = {
                {"pen", "钢笔"},
                {"pencil", "铅笔"},
                {"pencil case", "铅笔盒"},
                {"rule", "尺子"},
                {"book", "书"},
                {"bookmark", "书签"}
        };
        String strE = "pencil";
        String strC = "";
        int flag = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i][0].compareTo(strE) == 0) {
                strC = list[i][1];
                logger.info("查找到中文字义为：{}", strC);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            logger.info("没有找到匹配的中文字义");
        }
    }

}
