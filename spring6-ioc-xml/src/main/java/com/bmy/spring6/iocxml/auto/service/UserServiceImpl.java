package com.bmy.spring6.iocxml.auto.service;

import com.bmy.spring6.iocxml.User;
import com.bmy.spring6.iocxml.auto.dao.UserDao;

/**
 * ClassName:UserServiceImpl
 * Package:com.bmy.spring6.iocxml.auto.service
 * Description:
 *
 * @Creat:2024/4/1
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("UserService执行了");
        userDao.addUserDao();
    }
}
