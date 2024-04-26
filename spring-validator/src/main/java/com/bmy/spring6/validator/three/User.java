package com.bmy.spring6.validator.three;

import com.bmy.spring6.validator.four.CannotBlank;
import jakarta.validation.constraints.*;

/**
 * ClassName:User
 * Package:com.bmy.spring6.validator.three
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
    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误")
    @NotBlank(message = "手机号码不能为空")
    private String phone;
    @CannotBlank
    private String messg;


    public String getMessg() {
        return messg;
    }

    public void setMessg(String messg) {
        this.messg = messg;
    }


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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
