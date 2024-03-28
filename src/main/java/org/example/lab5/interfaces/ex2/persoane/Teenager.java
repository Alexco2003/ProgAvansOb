package org.example.lab5.interfaces.ex2.persoane;

public interface Teenager extends Person{
    @Override
    default void vote() {
        System.out.println("I can't vote!");
    }
}
