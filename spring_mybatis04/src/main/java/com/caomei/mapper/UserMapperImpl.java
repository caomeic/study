package com.caomei.mapper;

import com.caomei.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author 🍓
 * create in 2023/2/10 10:07
 * 我想干嘛：
 */
public class UserMapperImpl implements UserMapper{
    //我们所有的操作，在原来我们的操作都使用sqlsession来执行，现在我们使用sqlsessionTemplate进行
    private SqlSessionTemplate sqlSessionTemplate;
    public void setSqlSession(SqlSessionTemplate sqlSession){
        this.sqlSessionTemplate=sqlSession;
    }
    @Override
    public List<User> selectUser() {
        UserMapper mapper=sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
