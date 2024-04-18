package org.example.lab8.src.main.java.serialization.ex1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectUidDeserialization {
    public static void main(String[] args) {
        try (ObjectInputStream fin = new ObjectInputStream(
                new FileInputStream("./src/main/java/org/example/lab8/objectUid.ser"))) {
            ObjectWithSerialVersionUID obj = (ObjectWithSerialVersionUID) fin.readObject();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Change the value of serialVersionUID (in ObjectWithSerialVersionUID) and run again => InvalidClassException
    }
}
