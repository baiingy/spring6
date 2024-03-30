package com.bmy.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:UserTest
 * Package:com.bmy.spring6.iocxml
 * Description:
 *
 * @Creat:2024/3/30
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        User user1 = (User) context.getBean("user");
        System.out.println("根据id获取"+user1);

        /*根据类型获取时:::指定类型的bean只能有一个*/
        User user2 = context.getBean(User.class);
        System.out.println("根据类型获取"+user2);

        User user3 = context.getBean("user",User.class);
        System.out.println("根据id和类型获取"+user3);
    }
}
