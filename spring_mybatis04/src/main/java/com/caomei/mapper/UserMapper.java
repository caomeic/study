package com.caomei.mapper;

import com.caomei.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 🍓
 * create in 2023/2/10 10:05
 * 我想干嘛：
 */
public interface UserMapper {
    @Select("select * from user")
    public List<User> selectUser();
}
