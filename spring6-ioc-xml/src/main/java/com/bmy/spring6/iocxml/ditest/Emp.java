package com.bmy.spring6.iocxml.ditest;

import java.util.Arrays;

/**
 * ClassName:Emp
 * Package:com.bmy.spring6.iocxml.ditest
 * Description:
 *
 * @Creat:2024/4/1
 */
public class Emp {
    private String[] loves;
    private Dept dept;
    private String Ename;
    private Integer age;
    public void work(){
        System.out.println(Ename+"work()中............");
        System.out.println(Ename+"的爱好有"+Arrays.toString(loves));
        System.out.println(Ename+"在"+dept.getDname()+"工作");
    }
    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
