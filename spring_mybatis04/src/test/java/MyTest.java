import com.caomei.mapper.UserMapper;
import com.caomei.mapper.UserMapperImpl;
import com.caomei.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 🍓
 * create in 2023/2/10 10:09
 * 我想干嘛：
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserMapperImpl userMapper = (UserMapperImpl) context.getBean("userMapper");
        List<User> users = userMapper.selectUser();
        System.out.println(users);
    }
}
