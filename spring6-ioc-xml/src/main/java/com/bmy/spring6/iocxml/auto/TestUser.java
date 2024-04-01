package com.bmy.spring6.iocxml.auto;

import com.bmy.spring6.iocxml.auto.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:TestUser
 * Package:com.bmy.spring6.iocxml.auto
 * Description:
 *
 * @Creat:2024/4/1
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.addUser();
    }
}
