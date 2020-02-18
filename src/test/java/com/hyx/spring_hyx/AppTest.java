package com.hyx.spring_hyx;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_aop.service.StudentService;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test01(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        StudentService studentService = ctx.getBean("studentService", StudentService.class);
        studentService.add(1,2);
        System.out.println("===============");
        studentService.div(15,5);
    }
}
