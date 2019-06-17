package com.java.demo.chapter29.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Description: Sample19_2
 * @Author: miaolei
 * @Date: 2019/6/17 23:49
 */
public class Sample19_2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample19_2.class);

    public static void randomWriteFile(File file) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("张三", 23);
        employees[1] = new Employee("赵云", 24);
        employees[2] = new Employee("李四", 25);
        employees[3] = new Employee("王五", 22);
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            for (Employee e: employees) {
                randomAccessFile.writeChars(e.getName());
                randomAccessFile.writeInt(e.getAge());
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
    }

    private static String readName(RandomAccessFile randomAccessFile) throws IOException {
        char[] name = new char[8];
        for (int i = 0; i < name.length; i++) {
            name[i] = randomAccessFile.readChar();
        }
        return new String(name).replace('\0', ' ');
    }

    public static Employee[] randomReadFile(File file) {
        RandomAccessFile randomAccessFile = null;
        Employee[] employees = null;
        try {
            randomAccessFile= new RandomAccessFile(file, "r");
            employees = new Employee[4];
            int num = (int) randomAccessFile.length() / Employee.size();
            for (int i = 0; i < num; i++) {
                randomAccessFile.seek(i * Employee.size());
                employees[i] = new Employee(readName(randomAccessFile), randomAccessFile.readInt());
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
        return employees;
    }

    public static void main(String[] args) {
        String fileName = "D:\\Development\\test1.txt";
        File file = new File(fileName);
        randomWriteFile(file);
        Employee[] employees = randomReadFile(file);
        for (Employee e : employees) {
            logger.info("name={},age={}", e.getName(), e.getAge());
        }
    }

}
