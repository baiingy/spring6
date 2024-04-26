package com.bmy.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName:SpringJUnit5Test
 * Package:com.bmy.bean
 * Description:
 *
 * @Creat:2024/4/12
 */

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class SpringJUnit5Test {
    @Autowired
    private User user;

    @Test
    public void testUser(){
        System.out.println(user);
    }
}
