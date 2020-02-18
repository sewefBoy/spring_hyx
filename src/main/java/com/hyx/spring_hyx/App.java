package com.hyx.spring_hyx;

import com.hyx.spring_hyx.bean.Address;
import com.hyx.spring_hyx.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Student student = (Student) context.getBean("student");
        Student student1 = (Student) context.getBean("student");
        System.out.println(student.toString());
        System.out.println(student1.toString());
        System.out.println(student == student1);

        Student student2 = (Student) context.getBean("person2");
        System.out.println(student2.toString());

        System.out.println("--------------------------------");
        Student student3 = (Student) context.getBean("studentS");
        System.out.println(student3.toString());
        Student student4 = (Student) context.getBean("studentI");
        System.out.println(student4.toString());

        System.out.println("--------------------------------");
        Student s = (Student) context.getBean("myFactoryBean");
        System.out.println(s.toString());

        System.out.println("--------------------------------");
        Address address = (Address) context.getBean("initdestory");
        System.out.println(address.toString());
        //applicationContext没有close方法，需要使用具体的子类
        ((ClassPathXmlApplicationContext)context).close();
    }
}
