package com.bmy.spring6.validator.two;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * ClassName:User
 * Package:com.bmy.spring6.validator.two
 * Description:
 *
 * @Creat:2024/4/12
 */
public class User {
    @NotNull
    private String name;
    @Min(1)
    @Max(110)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
