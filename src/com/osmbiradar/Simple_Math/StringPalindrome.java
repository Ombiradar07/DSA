package com.osmbiradar.Simple_Math;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {

        // TODO: To find out whether the given String is Palindrome or not.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String....");
        String input = sc.next();

        int i = 0;
        int j = input.length() - 1;


        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                System.out.println("Not a Palindrome");
                break;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");

    }
}
