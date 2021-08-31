package com.test;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class RedisBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    @Override
    protected Class<?> getBeanClass(Element element) {
//        return Redis.class
        return super.getBeanClass(element);
    }

    @Override
    protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
        String ip = element.getAttribute("ip");
        String port = element.getAttribute("port");
        builder.addConstructorArgValue(ip);
        builder.addConstructorArgValue(port);
    }
}
