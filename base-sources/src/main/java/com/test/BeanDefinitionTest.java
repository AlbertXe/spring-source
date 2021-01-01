package com.test;

import com.po.Student2;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * studeng2没有注解
 * 86150
 * BeanDefinitionTest
 * 2020/12/30 17:21
 */
@Component
public class BeanDefinitionTest implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        GenericBeanDefinition definition = new GenericBeanDefinition();
        definition.setBeanClass(Student2.class);

        MutablePropertyValues propertyValues = definition.getPropertyValues();
        propertyValues.addPropertyValue("name", "xie");
        registry.registerBeanDefinition("student2", definition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com");
        Student2 student = (Student2) context.getBean("student2");
        System.out.println(student.getName());
    }
}
