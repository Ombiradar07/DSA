package com.osmbiradar.Simple_Math;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        // TODO: Take 2 numbers as input and print the largest number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2)
            System.out.printf("largest is " + num1);
        else if (num2 > num1)
            System.out.printf("Largest is " + num2);
        else
            System.out.printf("Both are equal");

    }
}
