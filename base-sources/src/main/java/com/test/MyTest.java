package com.test;

import com.po.AService;
import com.po.OriginClass;
import com.po.Student;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
        AService aService = context.getBean(AService.class);
        aService.aop();
    }

    @Test
    public void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
    }

    @Test
    public void test3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        OriginClass student = (OriginClass) context.getBean("originClass");
        student.method("name");
    }

    @Test
    public void test4() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com");

        AnnotationAwareAspectJAutoProxyCreator creator = context.getBean(AnnotationAwareAspectJAutoProxyCreator.class);
        creator.setInterceptorNames("girlInterceptor");
        AService aService = context.getBean(AService.class);
        aService.aop();
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
    }


}
