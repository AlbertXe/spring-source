package com.config;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * 自定义标签处理
 * <jack:redis></jack:redis>
 * 86150
 * RedisBeanDefinitionParser
 * 2020/12/30 21:38
 */
public class RedisBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    @Override
    protected Class<?> getBeanClass(Element element) {
        return super.getBeanClass(element);
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        super.doParse(element, builder);
    }
}

