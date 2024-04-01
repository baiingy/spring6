package com.bmy.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName:UserDaoImpl
 * Package:com.bmy.spring6.autowired.dao
 * Description:
 *
 * @Creat:2024/4/1
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("Dao......");
    }
}
