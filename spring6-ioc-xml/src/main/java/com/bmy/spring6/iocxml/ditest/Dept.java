package com.bmy.spring6.iocxml.ditest;

import java.util.List;

/**
 * ClassName:Dept
 * Package:com.bmy.spring6.iocxml.ditest
 * Description:
 *
 * @Creat:2024/4/1
 */
public class Dept {
    private List<Emp> empList;
    private String Dname;
    public void info(){
        System.out.println(Dname);
        for (Emp emp :
                empList) {
            System.out.println(emp.getEname());
        }
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

}
