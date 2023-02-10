package com.caomei.pojo;

import lombok.Data;

/**
 * @author 🍓
 * create in 2023/2/6 19:06
 * 我想干嘛：
 */

public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name = " + name);
    }
    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }
}
