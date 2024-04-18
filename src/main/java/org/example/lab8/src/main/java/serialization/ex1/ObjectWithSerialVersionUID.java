package org.example.lab8.src.main.java.serialization.ex1;

import java.io.Serializable;

public class ObjectWithSerialVersionUID implements Serializable {
    private static final long serialVersionUID = 1234568;

    private String name;

    private int age;

    public ObjectWithSerialVersionUID(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ObjectWithSerialVersionUID{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
