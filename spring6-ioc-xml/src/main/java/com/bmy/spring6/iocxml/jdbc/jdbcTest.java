package com.bmy.spring6.iocxml.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        String sql = "insert into students (id,name,gender,age,class) values (?,?,?,?,?);";
        int rows = jdbcTemplate.update(sql, 9,"十一", "男", 18, "二年三班");
        System.out.println("rows = " + rows);

    }
}
