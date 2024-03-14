package org.example.lab3.animal;

public class Ape extends Animal {

    private String size;

    public Ape() {
    }
    public Ape(String name, int noOfLegs, String size) {
        super(name, noOfLegs); // call the constructor of the parent class
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void move() {
        System.out.println("Ape climbing");
    }

    @Override
    public void eat() {
        System.out.println("Ape eating");
    }

    @Override
    public void eat(String food) {
        System.out.println("Ape eating " + food);
    }


}
