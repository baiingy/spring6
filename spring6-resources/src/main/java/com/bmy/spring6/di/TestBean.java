package com.bmy.spring6.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:TestBean
 * Package:com.bmy.spring6.di
 * Description:
 *
 * @Creat:2024/4/10
 */
public class TestBean {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        ResouceBean bean = context.getBean(ResouceBean.class);
        bean.parse();
    }
}
