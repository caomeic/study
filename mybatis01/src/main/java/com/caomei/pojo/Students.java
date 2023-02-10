package com.caomei.pojo;

/**
 * @author 🍓
 * create in 2023/2/3 10:36
 * 我想干嘛：
 */
public class Students {
    private int sid;
    private String sname;
    // 添加【Teachers】类属性
    private Teachers teacher;

    public Students() {
    }

    public Students(int sid, String sname, Teachers teacher) {
        this.sid = sid;
        this.sname = sname;
        this.teacher = teacher;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Teachers getTeacher() {
        return teacher;
    }

    public void setTeacher(Teachers teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Students{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", teacher=" + teacher +
                '}';
    }

}
