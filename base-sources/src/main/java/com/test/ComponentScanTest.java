package com.test;

import com.po.OriginClass;
import com.po.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {
    @Autowired
    private OriginClass originClass;
    @Autowired
    private Student student;
    @Test
    public void m1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanBean.class);
//        originClass.method("hello");
        student = context.getBean("student",Student.class);
        System.out.println(student);
    }
}
