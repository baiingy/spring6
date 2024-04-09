package com.bmy.spring6.aop.xmlaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:TestAop
 * Package:com.bmy.spring6.aop.annoaop
 * Description:
 *
 * @Creat:2024/4/3
 */
public class TestAop {
    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beanaop.xml");
        Calculate calculate = context.getBean(Calculate.class);
        calculate.add(24,6);
    }
}
