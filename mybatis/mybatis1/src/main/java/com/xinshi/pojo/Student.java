package com.xinshi.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private  int id;
    private String name;
    private int age;
    private String gender;
    private int chinese;
    private int english;

}
