package com.bmy.spring6.autowired.service;

import com.bmy.spring6.autowired.dao.UserDao;
import com.bmy.spring6.autowired.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Package:com.bmy.spring6.autowired.service
 * Description:
 *
 * @Creat:2024/4/1
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("service........");
        userDao.add();
    }

    /*@Autowired
    private UserDao userDao;*/
    /*private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/
    private UserDao userDao;

//    @Autowired
    /*public UserServiceImpl(@Autowired UserDao userDao) {
        this.userDao = userDao;
    }*/
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
}
