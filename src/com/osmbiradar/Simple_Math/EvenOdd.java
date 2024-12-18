package com.osmbiradar.Simple_Math;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        // TODO: Write a program to print whether a number is even or odd, also take input from the user.

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
