package com.osmbiradar.Simple_Math;

import java.util.Scanner;

public class NumberPalindrome {

    public static void main(String[] args) {

        // TODO: To find Armstrong Number between two given number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number....");
        int number = sc.nextInt();

        int temp = number;
        int reversedNumber = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }

        if (number == reversedNumber)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a Palindrome number");

    }
}
