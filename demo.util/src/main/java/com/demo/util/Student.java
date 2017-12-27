package com.demo.util;

import com.demo.util.Classroom;

public class Student extends Classroom
{
    private String name;
    private int age;

    public Student() {}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return this.name + "、" + this.age + "、" + super.getGrade() + "、" + super.getClassNum();
    }

    @Override
    public void test() {
        System.out.println("这是一个子类的测试");
    }
}