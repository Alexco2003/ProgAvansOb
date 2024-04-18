package org.example.lab8.src.main.java.serialization.ex2;

import java.io.*;

public class CatDeserialization {
    public static void main(String[] args) {

        try (ObjectInputStream fin = new ObjectInputStream(
                new FileInputStream("./src/main/java/org/example/lab8/cat.ser"))) {
            Cat cat = (Cat) fin.readObject();
        } catch (Exception e) {
            e.printStackTrace(); //  NotSerializableException // Solutions: 1. make Tail's Fur fur transient; 2. Fur implements Serializable
        }

    }
}
