package com.bmy.spring6.Book.service;

import com.bmy.spring6.Book.controller.BookController;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Book;

/**
 * ClassName:CheckoutService
 * Package:com.bmy.spring6.Book.service
 * Description:
 *
 * @Creat:2024/4/9
 */
public interface CheckoutService {
    void checkout(Integer[] bookIds, Integer userId);
}
