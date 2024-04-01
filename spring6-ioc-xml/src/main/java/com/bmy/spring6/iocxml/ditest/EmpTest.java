package com.bmy.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:EmpTest
 * Package:com.bmy.spring6.iocxml.ditest
 * Description:
 *
 * @Creat:2024/4/1
 */
public class EmpTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-dilist.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.work();
        Dept dept = context.getBean("dept", Dept.class);
        dept.info();

    }
}
