package com.bmy.spring6.iocxml.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:jdbcTest
 * Package:com.bmy.spring6.iocxml.jdbc
 * Description:
 *
 * @Creat:2024/4/1
 */
public class jdbcTest {
    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource dataSource = context.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }
}
