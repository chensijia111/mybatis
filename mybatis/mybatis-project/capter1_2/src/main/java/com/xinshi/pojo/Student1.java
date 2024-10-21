package com.xinshi.pojo;

import java.util.List;

public class Student1 {
    private Integer sId;
    private String sName;
    private Integer age;
    private String gender;
    private List<Score> scoreList;
    public Student1(){

    }

    public Student1(Integer sId, String sName, Integer age, String gender, List<Score> scoreList) {
        this.sId = sId;
        this.sName = sName;
        this.age = age;
        this.gender = gender;
        this.scoreList = scoreList;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", scoreList=" + scoreList +
                '}';
    }


}