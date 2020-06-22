package com;

import com.po.Student;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());

    }
}
