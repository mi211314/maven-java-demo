package com.java.demo.chapter30.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * @Description: Sample30_2
 * @Author: miaolei
 * @Date: 2019/7/16 22:02
 */
public class Sample30_2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample30_2.class);

    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_database", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from log4j");
            ResultSetMetaData metaData = resultSet.getMetaData();
            logger.info("字段名\t字段类型\t字段显示宽度");
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                String listName = metaData.getColumnName(i);
                String type = metaData.getColumnTypeName(i);
                int size = metaData.getColumnDisplaySize(i);
                logger.info("{}\t{}\t{}", listName, type, size);
            }
            resultSet.close();
            statement.cancel();
        } catch (ClassNotFoundException e) {
            logger.error(e.getMessage(), e);
        } catch (SQLException e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                logger.error(e.getMessage(), e);
            }
        }
    }

}
