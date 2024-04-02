package com.bmy.serivce.Impl;

import com.bmy.anno.Bean;
import com.bmy.anno.Di;
import com.bmy.dao.UserDao;
import com.bmy.serivce.UserService;

/**
 * ClassName:UserServiceImpl
 * Package:com.bmy.serivce
 * Description:
 *
 * @Creat:2024/4/2
 */
@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void out() {
        userDao.print();
        System.out.println("Service层执行结束");
    }
}
