package com.bmy.spring6.validator.two;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName:TestUser
 * Package:com.bmy.spring6.validator.two
 * Description:
 *
 * @Creat:2024/4/12
 */
public class TestUser {
    @Test
    public void testValidationOne(){
        ApplicationContext context=new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation1 myValidation1 = context.getBean(MyValidation1.class);
        User user=new User();
        boolean b = myValidation1.validatorUserOne(user);
        System.out.println(b);
    }

    @Test
    public void testValidationTwo(){
        ApplicationContext context=new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation2 myValidation2 = context.getBean(MyValidation2.class);
        User user=new User();
        user.setName("aaaaa");
        user.setAge(0);
        boolean b = myValidation2.validatorUserTwo(user);
        System.out.println(b);
    }
}
