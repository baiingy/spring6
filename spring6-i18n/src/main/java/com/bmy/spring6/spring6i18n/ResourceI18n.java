package com.bmy.spring6.spring6i18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ClassName:resourcesi18n
 * Package:com.bmy.spring6.javai18n
 * Description:
 *
 * @Creat:2024/4/10
 */
public class ResourceI18n {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Object[] obj = {"baibai", new Date().toString()};
        String hello = context.getMessage("hello", obj, Locale.CHINA);
        System.out.println(hello);

    }
}
