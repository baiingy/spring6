package com.bmy.spring6.Book;

import com.bmy.spring6.Book.config.SpringConfig;
import com.bmy.spring6.Book.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName:TestBookAnno
 * Package:com.bmy.spring6.Book
 * Description:
 *
 * @Creat:2024/4/9
 */
public class TestBookAnno {
    @Test
    public void testTxAllAnno(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController bookController = (BookController) applicationContext.getBean("bookController",BookController.class);
        Integer[] bookIds={1,2};
        bookController.checkout(bookIds,1);

    }
}
