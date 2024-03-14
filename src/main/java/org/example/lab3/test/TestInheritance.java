package org.example.lab3.test;

import org.example.lab3.animal.Animal;
import org.example.lab3.animal.Ape;

public class TestInheritance {

    public static void main(String[] args) {
        Animal animal = new Animal("dog", 4);
        animal.move();

        Ape ape = new Ape("gorilla", 2, "big");
        ape.move();
    }

}