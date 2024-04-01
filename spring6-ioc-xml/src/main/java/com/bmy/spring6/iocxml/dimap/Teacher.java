package com.bmy.spring6.iocxml.dimap;

/**
 * ClassName:Teacher
 * Package:com.bmy.spring6.iocxml.dimap
 * Description:
 *
 * @Creat:2024/4/1
 */
public class Teacher {
    private String tid;
    private String tname;

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
