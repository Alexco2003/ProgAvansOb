package org.example.lab6.src.test.marker;

import org.example.lab6.src.marker.SerializableClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializableClass {
    public static void main(String[] args) throws IOException {
        SerializableClass s1 = new SerializableClass();

        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
    }
}
