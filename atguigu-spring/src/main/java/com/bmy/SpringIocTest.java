package com.bmy;

import com.bmy.bean.AnnotationApplicationContext;
import com.bmy.bean.ApplicationContext;
import com.bmy.serivce.UserService;
import org.junit.jupiter.api.Test;

/**
 * ClassName:TestIocSpring
 * Package:com.bmy
 * Description:
 *
 * @Creat:2024/4/2
 */
public class SpringIocTest {

    @Test
    public void testIoc() {
        ApplicationContext applicationContext = new AnnotationApplicationContext("com.bmy");
        UserService userService = (UserService)applicationContext.getBean(UserService.class);
        userService.out();
        System.out.println("run success");
    }
}