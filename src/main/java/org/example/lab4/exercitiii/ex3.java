//3. Given a string of letters.
//        Find out the number of occurrence of each letter in that string.
//        Print them in lexicographical order
//
//        Input:
//        "abracadabra:
//
//        Output:
//        a: 5
//        b: 2
//        c: 1
//        d: 1
//        r: 2


package org.example.lab4.exercitiii;

import java.util.Scanner;
import java.util.TreeMap;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1  = in.nextLine();
        TreeMap<Character, Integer> hashmap = new TreeMap<Character, Integer>();


        for (int i=0; i<str1.length(); i++)
        {
            if (hashmap.containsKey(str1.charAt(i)))
            {
                hashmap.put(str1.charAt(i), hashmap.get(str1.charAt(i)) + 1);

            }
            else
            {

                hashmap.put(str1.charAt(i),1);
            }


        }

        for(Character key: hashmap.keySet()){
            System.out.println(key+": "+hashmap.get(key));
        }










    }
}
