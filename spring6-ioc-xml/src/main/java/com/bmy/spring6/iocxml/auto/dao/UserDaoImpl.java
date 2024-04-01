package com.bmy.spring6.iocxml.auto.dao;

/**
 * ClassName:UserDaoImpl
 * Package:com.bmy.spring6.iocxml.auto.dao
 * Description:
 *
 * @Creat:2024/4/1
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void addUserDao() {
        System.out.println("userDao方法执行了");
    }
}
