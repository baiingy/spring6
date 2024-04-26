package com.bmy.spring6.Book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:CheckoutImpl
 * Package:com.bmy.spring6.Book.service
 * Description:
 *
 * @Creat:2024/4/9
 */
@Service
public class CheckoutServiceImpl implements CheckoutService{
    @Autowired
    private BookService bookService;

    @Override
    @Transactional
    //一次购买多本图书
    public void checkout(Integer[] bookIds, Integer userId) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(bookId, userId);
        }
    }
}
