package com.bmy.spring6.iocxml.auto.controller;

import com.bmy.spring6.iocxml.auto.service.UserService;

/**
 * ClassName:UserController
 * Package:com.bmy.spring6.iocxml.auto.controller
 * Description:
 *
 * @Creat:2024/4/1
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("controller执行了");
        userService.addUserService();

    }
}
