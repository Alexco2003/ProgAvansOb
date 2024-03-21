//2.  Write a program to find the number of vowels, consonants, digits and white space characters in a string.
//
//Input:
//        "This is 1 string"
//
//Output:
//Vowels: 3
//Consonants: 9
//Digits: 1
//Spaces: 3

package org.example.lab4.exercitiii;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The string: ");
        String str1  = in.nextLine();

        int vowels=0, consonants = 0, digits =0, spaces = 0;

        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e'
                    || str1.charAt(i) == 'i'
                    || str1.charAt(i) == 'o'
                    || str1.charAt(i) == 'u') {
                vowels++;
            }
            else if (Character.isAlphabetic(str1.charAt(i)))
            {
                consonants++;
            } else if (Character.isDigit((str1.charAt(i)))) {
                digits++;

            } else if (str1.charAt(i) == ' ') {
                spaces++;

            }





        }
        System.out.println("Vowels: " + vowels + "\n" + "Consonants: " + consonants + "\n" + "Digits: " + digits + "\n" + "Spaces: " + spaces);


    }
}
