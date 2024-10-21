import com.xinshi.mapper.Student1Mapper;
import com.xinshi.pojo.Student1;
import com.xinshi.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Student1Test {
    @Test
    public void testFindStudent1ById1(){
        SqlSession sqlSession = null;
        try {
            // 获取SqlSession
            sqlSession = SqlSessionUtil.getSqlSession();
            // 获取ProvinceMapper
            Student1Mapper student1Mapper = sqlSession.getMapper(Student1Mapper.class);
            // 省份id
            int student1ID = 2;
            // 查询省份S
            Student1 student1 = student1Mapper.findStudent1ById1(student1ID);
            // 打印省份信息
            System.out.println(student1);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            SqlSessionUtil.closeSqlSession(sqlSession);
        }
    }
}
