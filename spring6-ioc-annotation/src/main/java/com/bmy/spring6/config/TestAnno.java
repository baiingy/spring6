package com.bmy.spring6.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName:TestAnno
 * Package:com.bmy.spring6.config
 * Description:
 *
 * @Creat:2024/4/2
 */
public class TestAnno {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Anno bean = context.getBean(Anno.class);
        System.out.println(bean);
    }
}
