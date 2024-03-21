//1. Write a Java program to compare two strings lexicographically, ignoring case differences.

package org.example.lab4.exercitiii;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First: ");
        String str1 = in.nextLine();
        System.out.print("Second string: ");
        String str2 = in.nextLine();

        int result = str1.compareToIgnoreCase(str2);

        if (result < 0) {
            System.out.println(str1 + " is less than " +  str2);
        } else if (result == 0) {
            System.out.println( str1 +  " is equal to " +  str2);
        } else {
            System.out.println(str1  + " is greater than " + str2);
        }


    }

}
