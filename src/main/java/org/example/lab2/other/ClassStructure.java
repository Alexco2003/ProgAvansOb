package org.example.lab2.other;

public class ClassStructure {
    /* Instance variable. Is a value defined within a specific instance of an object.
     * Two instances could have the same value for it, but changing the value for one does not modify the other.
     */
    private int a;

    /* Class variable. Is defined on the class level and shared among all instances of the class */
    private static int counter;

    static {
        counter++;
        //a = 2; //DOES NOT COMPILE: Non-static field 'a' cannot be referenced from a static context
        System.out.println("Executed static initialization block2");
    }

    /*
      This is an instance initialization block. It is run at the creation of each object, for that specific object.
      A class can have multiple such blocks and they will be executed in the order that they appear in the class.
     */
    {
        a++;
        counter++;
        System.out.println("Executed instance initialization block");
    }

    /*
      This a class initialization block. It is run the first time the class is references somewhere. It can only access
      static fields and methods in the class.
      A class can have multiple such blocks and they will be executed in the order that they appear in the class.
     */
    static {
        counter++;
        //a = 2; //DOES NOT COMPILE: Non-static field 'a' cannot be referenced from a static context
        System.out.println("Executed static initialization block");
    }




    private static void staticMethod() {
        //a = 3; // DOES NOT COMPILE: Non-static field 'a' cannot be referenced from a static context
        counter = 3;
        System.out.println("Executed staticMethod");
    }

    private void nonStaticMethod() {
        a = 4;
        counter = 4;
        staticMethod();
        System.out.println("Executed nonStaticMethod");
    }

    public static void main(String[] args) {
        staticMethod();
        //nonStaticMethod(); // DOES NOT COMPILE: Non-static method 'nonStaticMethod()' cannot be referenced from a static context
        System.out.println("Executed main method");
        System.out.println("counter = " + counter);
    }

    public int getA() {
        return a;
    }

    public static int getCounter() {
        return counter;
    }


    /** A .java file can have multi class definitions in it. However, only one can be public. */
    class NonPublicClass {

        /** class field */
        private int a;

        /** class method */
        public void somethingElse() { }
    }
}