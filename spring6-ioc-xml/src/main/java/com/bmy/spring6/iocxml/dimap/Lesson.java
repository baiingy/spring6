package com.bmy.spring6.iocxml.dimap;

/**
 * ClassName:Lession
 * Package:com.bmy.spring6.iocxml.dimap
 * Description:
 *
 * @Creat:2024/4/1
 */
public class Lesson {
    private String lname;

    @Override
    public String toString() {
        return "Lession{" +
                "lname='" + lname + '\'' +
                '}';
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
