package com.bmy.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:BookTest
 * Package:com.bmy.spring6.iocxml.di
 * Description:
 *
 * @Creat:2024/3/30
 */
public class BookTest {
    @Test
    public void testSetter(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = (Book) context.getBean("bookSet");
        System.out.println(book.toString());
    }

    @Test
    public void testConstructor(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = (Book) context.getBean("bookCon");
        System.out.println(book.toString());
    }
}
