package com.bmy.spring6.validator.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName:TestUser
 * Package:com.bmy.spring6.validator.three
 * Description:
 *
 * @Creat:2024/4/12
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyService service = context.getBean(MyService.class);
        User user=new User();
        user.setAge(1);
        user.setMessg("Tsel  jad");
        service.testMethod(user);
    }

}
