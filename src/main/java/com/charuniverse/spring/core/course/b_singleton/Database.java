package com.charuniverse.spring.core.course.b_singleton;

public class Database {

    private static Database instance;

    private Database() {
    }

    public static Database getInstance() {
        if (instance != null) {
            instance = new Database();
        }
        return instance;
    }

}
