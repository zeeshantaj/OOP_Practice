package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Check {
    public static void main(String[] args) {
//        String str1 = "race";
//        String str2 = "Care";

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter first String      type exit to stop");
            String str1 = scanner.next();

            if (str1.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter second String");
            String str2 = scanner.next();


            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();


            //check if length is same
            if (str1.length() == str2.length()) {

                // convert string to char Array
                char[] charArray1 = str1.toCharArray();
                char[] charArray2 = str2.toCharArray();

                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                boolean result = Arrays.equals(charArray1, charArray2);
                if (result) {
                    System.out.println(str1 + " And " + str2 + " Are Anagram");
                } else {
                    System.out.println(str1 + " And " + str2 + " Are Not Anagram");
                }

            } else {
                System.out.println(str1 + " And " + str2 + " Are Not Anagram");
            }
        }
        while (true);
        System.out.println("Anagram check stop");
    }
}
