package com.bmy.spring6.iocxml.bean;

/**
 * ClassName:UserDaoImpl
 * Package:com.bmy.spring6.iocxml.bean
 * Description:
 *
 * @Creat:2024/3/30
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("UserDaoImpl run()...............");
    }
}
