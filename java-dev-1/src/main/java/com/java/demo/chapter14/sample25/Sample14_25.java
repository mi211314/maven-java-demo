package com.java.demo.chapter14.sample25;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Description: Sample14_25
 * @Date: 2019/5/3 11:15
 */
public class Sample14_25 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_25.class);

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 1; i < 14; i++) {
            String s = null;
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    s = (i + 1) + "";
                    break;
                case 9:
                    s = "10";
                    break;
                case 10:
                    s = "J";
                    break;
                case 11:
                    s = "Q";
                    break;
                case 12:
                    s = "K";
                    break;
                case 13:
                    s = "A";
                    break;
                default:
                    break;
            }
            al.add("黑桃" + s);
            al.add("红桃" + s);
            al.add("梅花" + s);
            al.add("方片" + s);
        }
        al.add("大王");
        al.add("小王");
        logger.info("这是扑克牌的初始顺序：{}", al);
        Collections.shuffle(al);
        logger.info("这是扑克牌的洗过牌后的顺序：{}", al);
    }

}
