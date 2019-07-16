package com.java.demo.chapter30.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * @Description: Sample30_1
 * @Author: miaolei
 * @Date: 2019/7/16 21:38
 */
public class Sample30_1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample30_1.class);

    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_database", "root", "root");
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, null, new String[]{"TABLE"});
            while (resultSet.next()) {
                String tableName = resultSet.getString(3);
                logger.info("========================={}表======================", tableName);
                ResultSet fields = metaData.getColumns(null, null, tableName, null);
                logger.info("字段名\t字段类型\t字段首选宽度");
                while (fields.next()) {
                    logger.info("{}\t{}\t{}", fields.getString(4), fields.getString(6), fields.getString(7));
                }
                fields.close();
            }
            resultSet.close();
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
