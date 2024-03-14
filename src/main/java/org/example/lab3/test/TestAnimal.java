package org.example.lab3.test;

import org.example.lab3.animal.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal("Capra", 4);
        System.out.println(animal);
        System.out.println(animal2);
        animal.move();
        animal.eat();
        animal.eat("grass");



    }



}
