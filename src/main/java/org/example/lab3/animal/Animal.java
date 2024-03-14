package org.example.lab3.animal;

public class Animal {
    private String name;

    private int noOfLegs;

    public Animal() {

    }
    public Animal(String name, int noOfLegs) {
        this.name = name;
        this.noOfLegs = noOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public void move() {
        System.out.println("Animal moving");
    }

    public void eat() {
        System.out.println("Animal eating");
    }

    public void eat (String food){
        System.out.println("Animal eating " + food);

    }




}
