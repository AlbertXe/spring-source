package com.po;


import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * 86150
 * ReplaceClass
 * 2020/6/25 11:11
 */
public class ReplaceClass implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("replace.........");
        return null;
    }
}
