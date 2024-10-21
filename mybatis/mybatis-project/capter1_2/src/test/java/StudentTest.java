import com.xinshi.mapper.StudentMapper;
import com.xinshi.mapper.StudentMapper;
import com.xinshi.mapper.UserMapper;
import com.xinshi.pojo.Student;
import com.xinshi.pojo.User;
import com.xinshi.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Objects;
public class StudentTest {
    Student student;

    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student(101, "张三", 15, "male", 75, 80);
        int count = mapper.insertStudent(student);
        System.out.println(count);
        System.out.println("获取生成的主键id:" + student.getId());
    }

    @Test
    public void test2() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student(102, "周红", 14, "female", 71, 69);
        int count = mapper.insertStudent(student);
        System.out.println(count);
        System.out.println("获取生成的主键id:" + student.getId());
    }

    @Test
    public void test1() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        int count = mapper.updateStudent(102,"赵兰", 13,80);
        System.out.println(count);
    }


    @Test
    public void test4(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student=mapper.getStudent1(102);
        System.out.println(student);
    }

    @Test
    public void test5(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student=mapper.getStudent2("female");
        System.out.println(student);
    }

    @Test
    public void test6(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        int count = mapper.deleteStudent(101);
        System.out.println(count);
    }
}
