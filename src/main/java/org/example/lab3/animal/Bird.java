package org.example.lab3.animal;

public class Bird extends Animal{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bird() {}
    public Bird(String name, int noOfLegs, String color) {
        super(name, noOfLegs);
        this.color = color;
    }
    @Override
    public void move() {
        System.out.println("Bird flying");
    }

    @Override
    public void eat() {
        System.out.println("Bird eating");
    }

    @Override
    public void eat(String food) {
        System.out.println("Bird eating " + food);
    }
}
