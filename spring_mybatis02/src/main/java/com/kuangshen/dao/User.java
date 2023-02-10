package com.kuangshen.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 🍓
 * create in 2023/2/7 15:26
 * 我想干嘛：
 */
@Component("user")
public class User {
    @Value("你好")
    public String name;
}
