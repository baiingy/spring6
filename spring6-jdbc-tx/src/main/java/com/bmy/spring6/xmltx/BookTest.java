package com.bmy.spring6.xmltx;

import com.bmy.spring6.xmltx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
/**
 * ClassName:BookTest
 * Package:com.bmy.spring6.Book
 * Description:
 *
 * @Creat:2024/4/9
 */
@SpringJUnitConfig(locations = "classpath:beans-xml.xml")
public class BookTest {
    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
        bookController.buyBook(1,1);
    }


}
