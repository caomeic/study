package com.caomei;

import com.caomei.pojo.Hello;
import com.caomei.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 🍓
 * create in 2023/2/6 19:21
 * 我想干嘛：
 */
public class test {

    @Test
    public void test01(){
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello =(Hello) Context.getBean("hello");
        hello.show();
    }

    @Test
    public void DI(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("Student");
        System.out.println(student);
    }
}
