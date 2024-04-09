package com.bmy.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * ClassName:JdbcTemplateTest
 * Package:com.bmy.spring6.jdbc
 * Description:
 *
 * @Creat:2024/4/3
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void selectTest(){
        String sql="select * from t_emp where id=?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(emp);
    }
    @Test
    public void selectList(){
        String sql="select * from t_emp";
        List<Emp> emps = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(emps);
    }

    @Test
    public void selectValue(){
        String sql="select count(*) from t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
    @Test
    public void test1() {
//        String sql1 = "INSERT INTO t_emp VALUES (NULL,?,?,?)";
//        int i1 = jdbcTemplate.update(sql1, "baba", 19, "f");
//        System.out.println(i1);
        String sql2 = "delete from t_emp where id=?";
        int i2 = jdbcTemplate.update(sql2, 1);
        System.out.println(i2);
//        String sql3 = "update t_emp set name=? where id=?";
//        int i3 = jdbcTemplate.update(sql3, "bababa", 1);
//        System.out.println(i3);

    }
}
