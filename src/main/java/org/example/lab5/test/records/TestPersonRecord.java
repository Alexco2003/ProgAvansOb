package org.example.lab5.test.records;

import org.example.lab5.records.PersonRecord;

public class TestPersonRecord {
    public static void main(String[] args) {
        PersonRecord user = new PersonRecord("Maria", 30);
        System.out.println(user.name());
        System.out.println(user.age());
        System.out.println(user);
    }
}
