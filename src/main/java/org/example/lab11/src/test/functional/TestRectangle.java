package org.example.lab11.src.test.functional;

import org.example.lab11.src.functional.RectangleFI;

public class TestRectangle {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        RectangleFI r1 = (x, y) -> x * y;
        int area = r1.calculate(a, b);
        System.out.println("Area of rectangle is: " + area);

        RectangleFI r2 = (int x, int y) -> 2 * (x + y);
        int perimeter = r2.calculate(a, b);
        System.out.println("Perimeter of rectangle is: " + perimeter);




    }
}
