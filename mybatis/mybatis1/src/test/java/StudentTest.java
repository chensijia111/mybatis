import com.xinshi.mapper.StudentMapper;
import com.xinshi.pojo.Student;
import com.xinshi.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentTest {
    private  StudentMapper studentMapper;
    @Test
    public void testInsertStudent(){
        Student student1 = new Student();
        student1.setId(101);
        student1.setName("张三");
        student1.setAge(15);
        student1.setGender("male");
        student1.setChinese(75);
        student1.setEnglish(80);
        studentMapper.insertStudent(student1);

        Student student2 = new Student();
        student2.setId(102);
        student2.setName("周红");
        student2.setAge(14);
        student2.setGender("female");
        student2.setChinese(71);
        student2.setEnglish(69);
        studentMapper.insertStudent(student2);
    }

}
