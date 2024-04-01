package com.bmy.spring6.iocxml.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:TestOrders
 * Package:com.bmy.spring6.iocxml.scope
 * Description:
 *
 * @Creat:2024/4/1
 */
public class TestOrders {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders1 = context.getBean("orders", Orders.class);
        System.out.println(orders1);
        Orders orders2 = context.getBean("orders", Orders.class);
        System.out.println(orders2);

    }
}
