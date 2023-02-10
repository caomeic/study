package com.caomei;

import com.kuangshen.dao.Student;
import com.kuangshen.dao.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 🍓
 * create in 2023/2/7 15:48
 * 我想干嘛：
 */
@Configuration
@ComponentScan("com.kuangshen.dao")
@Import(User.class) // 可以添加其他配置
public class Test02 {

    @Bean
    public Student getStudent(){
        return new Student();
    }
}
