import com.xinshi.mapper.UserMapper;
import com.xinshi.pojo.User;
import com.xinshi.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class UserTest {
    @Test
    public void test(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user=mapper.getUserByUserId(71);
        System.out.println(user);
    }
    @Test
    public void test2(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users=mapper.getUser2("张军","123456");
        System.out.println(users);
    }
    @Test
    public void test3(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> user=mapper.getUser3("张军","123456");
        System.out.println(user);
    }
    @Test
    public void test4(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> user=mapper.getUser4("张军","男");
        System.out.println(user);
    }
    @Test
    public void test5(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1=new User(0,"张军","","");
        User user2=new User(0,"赵红","","");
        List<User> user=mapper.getUser5(user1,user2);
        System.out.println(user);
    }
    @Test
    public void test6(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> user=mapper.getUser6("张军","赵红");
        System.out.println(user);
    }

    @Test
    public void test7(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> user=mapper.getUser7("张军","赵红");
        System.out.println(user);
    }
    @Test
    public void test8(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(0, "周涛", "123456", "男");
        int count=mapper.insertUser(user);
        System.out.println(count);
        System.out.println("获取生成的主键id:"+user.getId());
    }
    @Test
    public void test9(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int count=mapper.updateUser(71,"张兰","女");
        System.out.println(count);
    }


}
