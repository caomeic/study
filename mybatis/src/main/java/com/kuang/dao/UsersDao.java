package com.kuang.dao;

import com.kuang.pojo.Users;

import java.util.HashMap;
import java.util.List;

/**
 * @author 🍓
 * create in 2023/1/15 17:10
 * 我想干嘛：
 */
public interface UsersDao {
    List<Users> getUsersInfo();

    Users getIdUser(int id);

    void insertUser(Users user);

    //批量插入
    int insertManyUsers(List<Users> usersList);

    // 【select】 模糊查询
    List<Users> getUsersInfoByPhantomSelect(String username);

    Users getUserInfoByUserId(int id);

    List<Users> getUsersInfoByLimit(HashMap<String,Integer> limitMap);

}
