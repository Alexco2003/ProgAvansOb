package org.example.lab6.src.marker;

import java.io.Serializable;

public class SerializableClass implements Serializable {
    String field1;
    int field2;


    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }
}
