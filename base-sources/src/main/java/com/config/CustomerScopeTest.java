package com.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerScopeTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com");
        for (int i = 0; i < 10; i++) {
            Object autoService = context.getBean("autoService");
            System.out.println(autoService);
        }
    }
}