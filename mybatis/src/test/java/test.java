import com.kuang.dao.UsersDao;
import com.kuang.pojo.Users;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author 🍓
 * create in 2023/1/15 19:23
 * 我想干嘛：
 */
public class test {
    public static void main(String[] args) {

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UsersDao mapper = sqlSession.getMapper(UsersDao.class);

//        List<Users> userInfo = mapper.getUsersInfo();
//
//        for(Users users : userInfo)
//            System.out.println(users);

//       Users user =  mapper.getIdUser(1);
//
//        System.out.println(user);

//        mapper.insertUser(new Users(5,"小刘","122112"));

        //提交事务 不提交事务插入不进去  sqlsession本身没有自动提交事务，需要自己手动提交事务

// 创建要插入的List集合信息
//        List<Users> users = new ArrayList<Users>();
//        users.add(new Users(6, "Aurthur", "aurthur"));
//        users.add(new Users(7, "Nero", "nero"));
//        users.add(new Users(8, "Gawain", "gawain"));
//        users.add(new Users(9, "Lancelot", "lancelot"));
//
//
//
//        int i = mapper.insertManyUsers(users);
//
//        if ( i > 0 ){
//            System.out.println("Insert Many Finished and Successful!");
//        }

//        sqlSession.commit();
//        List<Users> users = mapper.getUsersInfoByPhantomSelect("%e%");
//
//        for (Users user : users) {
//            System.out.println(user);
//        }
        //resultMap 结果映射
//        Users user =mapper.getUserInfoByUserId(1);

        // 指定HashMap传值给映射器Mapper
        // startIndex => 2
        // returnSize => 2
        HashMap<String,Integer> limitMap = new HashMap<String, Integer>();
        limitMap.put("startIndex",2);
        limitMap.put("returnSize",2);

        List<Users> users = mapper.getUsersInfoByLimit(limitMap);
        for (Users user : users) {
            System.out.println(user);
        }

        sqlSession.close();

    }
}
