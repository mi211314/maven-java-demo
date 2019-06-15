package com.java.demo.chapter12.sample13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample12_13
 *
 * @Date: 2019/3/26 22:05
 */
public class Sample12_13 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12_13.class);

    public static void main(String[] args) {
        try {
            int grade = findGrade(67);
            logger.info("67分的等级为：{}。", grade);

            grade = findGrade(-20);
            logger.info("-20分的等级为：{}。", grade);
        } catch (NoSuchScoreException e) {
            logger.error("{}", e.getMessage(), e);
        }
    }

    public static int findGrade(double score) throws NoSuchScoreException {
        if (score >= 0 && score < 60) {
            return 5;
        } else if (score >= 60 && score < 75) {
            return 4;
        } else if (score >= 75 && score < 85) {
            return 3;
        } else if (score >= 85 && score <= 100) {
            return 1;
        } else {
            throw new NoSuchScoreException("不合法的成绩：" + score + "！！！");
        }
    }

}
