package com.bmy.dao.Impl;

import com.bmy.anno.Bean;
import com.bmy.dao.UserDao;

/**
 * ClassName:UserDaoImpl
 * Package:com.bmy.dao
 * Description:
 *
 * @Creat:2024/4/2
 */
@Bean
public class UserDaoImpl implements UserDao {

    @Override
    public void print() {
        System.out.println("Dao层执行结束");
    }
}
