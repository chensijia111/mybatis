package com.xinshi.mapper;

import com.xinshi.pojo.Student;
import com.xinshi.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    public Student getStudentByStudentId(int id);
    public int insertStudent(@Param("student") Student student);

    public int updateStudent(@Param("id") int id,
                          @Param("name") String name,
                          @Param("age") int age,
                          @Param("chinese") int chinese

    );

    public List<Student> getStudent1(@Param("id") int id);
    public List<Student> getStudent2(@Param("gender") String gender);
    public int deleteStudent(@Param("id") int id);


}
