package com.bmy.spring6.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:TestUser
 * Package:com.bmy.spring6.bean
 * Description:
 *
 * @Creat:2024/4/1
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);


    }
}
