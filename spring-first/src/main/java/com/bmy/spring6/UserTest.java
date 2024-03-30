package com.bmy.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:UserTest
 * Package:com.bmy.spring6
 * Description:
 *
 * @Creat:2024/3/29
 */
public class UserTest {
    private Logger logger= LoggerFactory.getLogger(UserTest.class);
    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user");
        user.add();
        logger.info("entxangle");

    }
    @Test
    public void test2() throws Exception {
        Class clazz = Class.forName("com.bmy.spring6.User");
        User user = (User) clazz.getDeclaredConstructor().newInstance();

    }
}
