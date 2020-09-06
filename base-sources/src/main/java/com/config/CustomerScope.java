package com.config;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 * 86150
 * CustomerScope
 * 2020/9/6 19:47
 */
public class CustomerScope implements Scope {
    private ThreadLocal local = new ThreadLocal();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if (local.get() != null) {
            return local.get();
        } else {
            Object object = objectFactory.getObject();
            local.set(object);
            return object;
        }
    }

    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
