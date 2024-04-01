package com.bmy.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

/**
 * ClassName:Student
 * Package:com.bmy.spring6.iocxml.dimap
 * Description:
 *
 * @Creat:2024/4/1
 */
public class Student {
    private List<Lesson> lessons;
    private Map<String,Teacher> teacherMap;
    private String sid;
    private String sname;
    public void run(){
        System.out.println("学号:"+sid+"\t姓名:"+sname);
        System.out.println(teacherMap);
        System.out.println(lessons);
    }
    public List<Lesson> getLessions() {
        return lessons;
    }

    public void setLessions(List<Lesson> lessons) {
        this.lessons = lessons;
    }
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }
}
