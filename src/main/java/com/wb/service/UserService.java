package com.wb.service;

import com.wb.dao.UserDao;

public class UserService {

    UserDao userDao;

    public void zhuanzhang() {
        userDao.updateUser("a", "number-100");
        //int a = 1 / 0;
        userDao.updateUser("b", "number+100");
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
