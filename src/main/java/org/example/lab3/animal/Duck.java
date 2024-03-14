package org.example.lab3.animal;

import java.util.Objects;

public class Duck extends Bird{

    private int length;

    public Duck() {}

    public Duck(String name, int noOfLegs, String color, int length) {
        super(name, noOfLegs, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void move() {
        System.out.println("Duck swimming");
    }

    @Override
    public void eat() {
        System.out.println("Duck eating");
    }

    @Override
    public void eat(String food) {
        System.out.println("Duck eating " + food);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)
            return true;
        if(obj==null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Duck duck = (Duck) obj;
        return this.length == duck.length;

    }

    @Override
    public int hashCode() {
        return Objects.hash(length);

    }
}
