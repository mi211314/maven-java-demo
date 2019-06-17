package com.java.demo.chapter29.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;

/**
 * @Description: Sample29_1
 * @Author: miaolei
 * @Date: 2019/6/16 21:43
 */
public class Sample29_1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample29_1.class);

    public static void main(String[] args) {
        String fileName = "D:\\Development\\Projects\\maven-java-demo\\" +
                "java-dev-1\\src\\main\\java\\com\\java\\demo\\chapter29\\sample1";
        File file = new File(fileName);
        Filter filter = new Filter("java");
        new Sample29_1().readFileList(file, filter);
    }

    public void readFileList(File file, Filter filter) {
        if (file.isDirectory()) {
            File[] files = file.listFiles(filter);
            ArrayList<File> fileList = new ArrayList<>();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    logger.info("[{}]", files[i].getPath());
                    readFileList(files[i], filter);
                } else {
                    fileList.add(files[i]);
                }
            }
            for (File f : fileList) {
                fileDesc(f);
            }
        } else if (file.isFile()) {
            fileDesc(file);
        }
    }

    public void fileDesc(File file) {
        if (file.isFile()) {
            logger.info("{}，该文件{}，{}，{}字节",
                    file.toString(),
                    (file.canRead() ? "可读" : "不可读"),
                    (file.canWrite() ? "可写" : "不可写"),
                    file.length());
        }
    }

}
