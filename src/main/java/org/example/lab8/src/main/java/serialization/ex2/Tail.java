package org.example.lab8.src.main.java.serialization.ex2;

import java.io.Serializable;

public class Tail implements Serializable {
    private transient Fur fur  = new Fur();
}