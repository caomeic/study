package com.caomei.daili2;

/**
 * @author 🍓
 * create in 2023/2/10 9:14
 * 我想干嘛：
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }

    @Override
    public void query() {
        System.out.println("查询用户");
    }

}
