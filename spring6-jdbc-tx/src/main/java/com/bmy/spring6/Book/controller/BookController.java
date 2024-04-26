package com.bmy.spring6.Book.controller;

import com.bmy.spring6.Book.service.BookService;
import com.bmy.spring6.Book.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName:BookController
 * Package:com.bmy.spring6.tx.controller
 * Description:
 *
 * @Creat:2024/4/6
 */

@Controller
public class BookController {

//    @Autowired
//    private BookService bookService;
//    public void buyBook(Integer bookId, Integer userId){
//        bookService.buyBook(bookId, userId);
//    }


    @Autowired
    private CheckoutService checkoutService;
    public void checkout(Integer[] bookIds, Integer userId){
        checkoutService.checkout(bookIds, userId);
    }
}
