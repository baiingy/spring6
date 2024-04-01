package com.bmy.spring6.autowired;

import com.bmy.spring6.autowired.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:TestUserController
 * Package:com.bmy.spring6.autowired
 * Description:
 *
 * @Creat:2024/4/1
 */
public class TestUserController {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.add();
    }
}
