package com.caomei;

import com.kuangshen.dao.Student;
import com.kuangshen.dao.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 🍓
 * create in 2023/2/7 15:27
 * 我想干嘛：
 */

public class test {
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.name);
    }

    @Test
/*
*
* 就是说可以利用java的方式，不一定需要beans.xml 利用myconfig的形式
*
*
* */
    public void Test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Test02.class");
        Student student = (Student) context.getBean("getStudent");
        System.out.println(student);
    }
}
