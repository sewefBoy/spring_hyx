package com.hyx.spring_hyx.factory;

import com.hyx.spring_hyx.bean.Student;

public class StudentInstanceFactory {
    public Student getStudent(String name){
        Student student = new Student();
        student.setId("1");
        student.setName(name);
        student.setGender("男");
        return student;
    }
}
