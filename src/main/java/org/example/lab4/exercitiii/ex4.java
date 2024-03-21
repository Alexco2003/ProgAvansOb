//4. Write a Java program to remove the duplicate elements of a given array and return the new length of the array.

package org.example.lab4.exercitiii;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();

        StringBuilder sb = new StringBuilder();
        Set<Character> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < str1.length(); i++) {
            linkedHashSet.add(str1.charAt(i));
        }

        for (Character c : linkedHashSet) {
            sb.append(c);
        }

        System.out.println(sb.length());

    }
}

