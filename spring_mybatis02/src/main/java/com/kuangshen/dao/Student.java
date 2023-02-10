package com.kuangshen.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @author 🍓
 * create in 2023/2/7 15:47
 * 我想干嘛：
 */
@Controller
public class Student {
    private String name;

    @Value("小明")
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
