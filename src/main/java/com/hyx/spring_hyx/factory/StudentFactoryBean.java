package com.hyx.spring_hyx.factory;

import com.hyx.spring_hyx.bean.Student;
import org.springframework.beans.factory.FactoryBean;

public class StudentFactoryBean implements FactoryBean<Student> {
    @Override
    public Student getObject() throws Exception {
        Student student = new Student();
        student.setId("22");
        student.setName("刘二愣子");
        return student;
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }
}
