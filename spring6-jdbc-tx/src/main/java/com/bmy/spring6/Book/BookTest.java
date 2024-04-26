package com.bmy.spring6.Book;

import com.alibaba.druid.pool.DruidDataSource;
import com.bmy.spring6.Book.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName:BookTest
 * Package:com.bmy.spring6.Book
 * Description:
 *
 * @Creat:2024/4/9
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class BookTest {
    @Autowired
    private BookController bookController;

//    @Test
//    public void testBuyBook(){
//        bookController.buyBook(1,1);
//    }
    @Test
    public void testBuyMoreBook(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        DruidDataSource dataSource = context.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
        Integer[] bookIds={1,2};
        bookController.checkout(bookIds,1);
    }

}
