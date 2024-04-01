package com.bmy.spring6.autowired.controller;

import com.bmy.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * ClassName:UserController
 * Package:com.bmy.spring6.autowired.controller
 * Description:
 *
 * @Creat:2024/4/1
 */
@Controller
public class UserController {
    /*1.属性注入*/
    /*@Autowired
    private UserService userService;*/

    /*2.set方法注入*/
    /*private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/
    private UserService userService;

    //    @Autowired
    /*public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }*/
    /*只有一个构造器,无注解注入*/
    /*public UserController(UserService userService) {
        this.userService = userService;
    }*/
    @Autowired
//    @Qualifier(value = "userServiceImpl")//根据名称进行匹配
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        System.out.println("controller......");
        userService.add();
    }
}
