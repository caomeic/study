package com.caomei;

import com.caomei.dao.UserDao;
import com.caomei.pojo.Users;
import com.caomei.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 🍓
 * create in 2023/2/3 10:18
 * 我想干嘛：
 */
public class test {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<Users> users = mapper.selectUsers();
        for (Users user: users
             ) {
            System.out.println(user);
        }
        
    }
}
