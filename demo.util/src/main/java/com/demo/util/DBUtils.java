package com.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBUtils
{
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            //TODO: handle exception
        }
        return connection;
    }
}