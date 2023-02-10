package com.caomei.dao;

import com.caomei.pojo.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 🍓
 * create in 2023/2/3 10:16
 * 我想干嘛：
 */
public interface UserDao {

    @Select("select * from user")
    List<Users> selectUsers();
    /*利用注解开发 ===== 》》》
    *
    * 优缺点：

- 优点：省去复杂的mapper映射器中的sql代码相关配置
- 缺点：无法执行复杂的SQL，例如：存在字段异常不匹配时，使用注解执行SQL容易出现找不到值的情况（查询结果为'null'）
    *
    *
    * */

}
