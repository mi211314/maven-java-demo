package com.java.demo.chapter5.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample4
 *
 * @Date: 2018/9/9 13:30
 */
public class Sample4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample4.class);

    public static void main(String[] args) {
        String[][] cartoons = {
                {"Flintstones", "Fred", "Willma", "Pebbles", "Dino"},
                {"Rubbles", "Barney", "Betty", "Bam Bam"},
                {"Scooby Doo Gang", "Scooby Doo", "Shaggy", "Velma", "Fred", "Daphne"}
        };
        for (int i = 0 ;i < cartoons.length; i++) {
            logger.info("{}:", cartoons[i][0]);
            for (int j = 0; j < cartoons[i].length; j++) {
                logger.info("{}", cartoons[i][j]);
            }
        }
    }

}
