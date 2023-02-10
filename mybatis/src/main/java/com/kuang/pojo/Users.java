package com.kuang.pojo;

import org.apache.ibatis.type.Alias;

import java.util.Objects;

public class Users {

    private int Id;
    private String Name;
    private String Passwd;

    public Users() {
    }

    public Users(int id, String name, String passwd) {
        Id = id;
        Name = name;
        Passwd = passwd;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPasswd() {
        return Passwd;
    }

    public void setPasswd(String passwd) {
        Passwd = passwd;
    }

    @Override
    public String toString() {
        return "Users{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Passwd='" + Passwd + '\'' +
                '}';
    }
}