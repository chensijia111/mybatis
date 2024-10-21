package com.xinshi.pojo;

public class Score {
    private Integer cId;
    private String cName;
    private Integer stuId;
    private float score;
    public Score(){
    }

    public Score(Integer cId, String cName, Integer stuId, float score) {
        this.cId = cId;
        this.cName = cName;
        this.stuId = stuId;
        this.score = score;
    }


    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Score{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", stuId=" + stuId +'\''+
                ",score="+score+
                '}';
    }
}
