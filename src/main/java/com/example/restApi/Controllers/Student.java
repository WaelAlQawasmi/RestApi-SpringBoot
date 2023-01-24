package com.example.restApi.Controllers;

public class Student {
    String name;
    String ClassName;
    int phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String aClass) {
        ClassName = aClass;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Student(String name, String aClass, int phone) {
        this.name = name;
        ClassName = aClass;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Class='" + ClassName + '\'' +
                ", phone=" + phone +
                '}';
    }
}
