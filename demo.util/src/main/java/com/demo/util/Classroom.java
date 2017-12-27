package com.demo.util;

public class Classroom
{
    private String grade;
    private String classNum;

    public Classroom() {}
    public Classroom(String grade, String classNum) {
        this.grade = grade;
        this.classNum = classNum;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClassNum() {
        return this.classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public void test() {
        System.out.println("这是一个测试");
    }
}