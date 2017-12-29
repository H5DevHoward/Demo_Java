package com.demo.controller;

import java.util.List;

import com.demo.dao.UserDao;
import com.demo.entity.User;

public class UserController
{
    UserDao userDao = new UserDao();
    public List<User> gUsers() {
        return userDao.users();
    }
}