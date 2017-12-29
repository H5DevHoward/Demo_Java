package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.demo.entity.User;
import com.demo.util.DBUtils;

public class UserDao
{
    private Connection connection = DBUtils.getConnection();
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public List<User> users() {
        List<User> users = new ArrayList<>();

        try {
            System.out.println(connection.getAutoCommit());
            preparedStatement = connection.prepareStatement("select * from student");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setName(resultSet.getString("name"));
                users.add(user);
            }
            preparedStatement.close();
        } catch (Exception e) {
            //TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

        return users;
    }
}