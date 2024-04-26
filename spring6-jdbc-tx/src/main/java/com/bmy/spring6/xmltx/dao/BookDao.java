package com.bmy.spring6.xmltx.dao;

/**
 * ClassName:BookDao
 * Package:com.bmy.spring6.tx.dao
 * Description:
 *
 * @Creat:2024/4/6
 */
public interface BookDao {
    Integer getPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateBalance(Integer userId, Integer price);
}
