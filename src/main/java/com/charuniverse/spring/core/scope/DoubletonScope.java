package com.charuniverse.spring.core.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.ArrayList;
import java.util.List;

public class DoubletonScope implements Scope {

    private int counter = 0;
    private List<Object> objects = new ArrayList<>(2);

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if (objects.size() == 2) {
            return objects.get(counter++ % 2);
        } else {
            Object object = objectFactory.getObject();
            objects.add(object);
            return object;
        }
    }

    @Override
    public Object remove(String name) {
        if (!objects.isEmpty()) {
            return objects.removeFirst();
        }
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
        return "";
    }

}
