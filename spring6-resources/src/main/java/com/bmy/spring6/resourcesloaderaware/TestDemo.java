package com.bmy.spring6.resourcesloaderaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;

/**
 * ClassName:TestDemo
 * Package:com.bmy.spring6.resourcesloaderaware
 * Description:
 *
 * @Creat:2024/4/10
 */
public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        TestBean testBean = applicationContext.getBean("testBean", TestBean.class);
        ResourceLoader resourceLoader = testBean.getResourceLoader();
        System.out.println(applicationContext==resourceLoader);
    }
}
