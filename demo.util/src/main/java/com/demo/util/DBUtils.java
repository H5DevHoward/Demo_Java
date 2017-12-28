package com.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DBUtils
{
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            // System.out.print(connection.getAutoCommit());
            preparedStatement = connection.prepareStatement("select sysdate() from dual");
            resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet.getDate(0));
        } catch (Exception e) {
            //TODO: handle exception
        }
        return connection;
    }
}