package org.example.lab5.test.ex2;

import org.example.lab5.interfaces.ex2.Horse;

public class TestHorse {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.move();
        System.out.println(horse.hasFur());
    }
}
