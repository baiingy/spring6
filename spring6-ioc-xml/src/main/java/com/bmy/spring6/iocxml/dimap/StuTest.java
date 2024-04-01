package com.bmy.spring6.iocxml.dimap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:StuTest
 * Package:com.bmy.spring6.iocxml.dimap
 * Description:
 *
 * @Creat:2024/4/1
 */
public class StuTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-diref.xml");
//        Student student = context.getBean("stu1", Student.class);
        Student student = context.getBean("stup", Student.class);
        student.run();

    }
}
