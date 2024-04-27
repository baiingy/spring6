package com.bmy.service;

import com.bmy.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:StudentService
 * Package:com.bmy.service
 * Description:
 *
 * @Creat:2024/4/26
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    /*
     *   TODO:注意：方法上的注解会覆盖类上的注解
     * 添加事务  @Transactional
     * 位置：方法(一个方法) | 类上(所有方法)
     * 只读模式：readOnly 默认 false
     *       一般都是通过类添加事务，类下所有方法都有事务，查询方法可以再次添加注解，设为只读模式提高效率 ！
     * 超时时间：timeout 默认-1 永远不超时
     *       超时回滚，释放异常 ! TransactionTimedOutException
     * 指定异常回滚：默认运行时异常才会回滚
     *       rollbackFor = Exception.class
     *       noRollbackFor 在异常回滚范围内，指定某个异常不回滚
     * 隔离级别：
     *        默认 isolation = Isolation.DEFAULT
     *    (mysql)默认 isolation = Isolation.REPEATABLE_READ
     *        推荐 isolation = Isolation.READ_COMMITTED
     * 事务传播行为：需要两个类，同一个类不生效
     *      propagation = Propagation.REQUIRED (推荐)默认
     *      如果父方法有事务，就加入，如果没有就新建自己独立！
     *      propagation = Propagation.REQUIRES_NEW
     *      不管父方法是否有事务，都新建事务，都是独立的！
     * */
    @Transactional(timeout = 3, rollbackFor = Exception.class)
    public void changeInfo() {
        studentDao.updateAgeById(88, 1);
//        int i=1/0;
        /*try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        System.out.println("-----------");
        studentDao.updateNameById("test1", 1);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void changeAge(){
        studentDao.updateAgeById(1,1);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void changeName(){
        studentDao.updateNameById("test2",1);
        int i = 1/0;
    }
}
