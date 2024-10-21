package com.xinshi.mapper;

import com.xinshi.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

public interface StudentMapper {
    @Insert("INSERT INTO student (id, name, age, gender, chinese, english) VALUES (#{id}, #{name}, #{age}, #{gender}, #{chinese}, #{english})")
    int insertStudent(Student student);


    Student getStudentByStudentId(int id);
}
