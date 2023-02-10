package com.caomei.pojo;

/**
 * @author 🍓
 * create in 2023/2/3 10:36
 * 我想干嘛：
 */
public class Teachers {
    private int tid;
    private String tname;

    public Teachers() {
    }

    public Teachers(int tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
