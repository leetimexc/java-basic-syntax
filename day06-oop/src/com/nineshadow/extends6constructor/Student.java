package com.nineshadow.extends6constructor;

public class Student {
    private String name;
    private char sex;
    private int age;
    private String SchoolName;

    public Student(){
        System.out.println("无参构造器");
    }

    // 使用this
    public Student(String name, char sex, int age) {
        this(name, sex, age, "华东理工大学");
    }


    public Student(String name, char sex, int age, String schoolName) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        SchoolName = schoolName;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", SchoolName='" + SchoolName + '\'' +
                '}';
    }
}
