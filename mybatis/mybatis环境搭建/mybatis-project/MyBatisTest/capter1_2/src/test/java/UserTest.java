import com.xinshi.mapper.UserMapper;
import com.xinshi.pojo.User;
import com.xinshi.util.SqlSessionUtil;
import lombok.experimental.StandardException;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest {

    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user =  mapper.getUserByUserId();
        System.out.println(user);


    }
}
