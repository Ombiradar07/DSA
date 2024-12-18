package com.osmbiradar.Simple_Math;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // TODO: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter two numbers and a operator");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String input = sc.next();
        char ch = input.charAt(0);

        if (ch == '+')
            System.out.printf("Sum of two numbers is " + (num1 + num2));
        else if (ch == '-')
            System.out.printf("Substraction of two numbers is " + (num1 - num2));
        else if (ch == '*')
            System.out.printf("Multiplication of two numbers is " + (num1 * num2));
        else if (ch == '/')
            System.out.printf("Division of two numbers is " + (num1 / num2));
        else if (ch == '%')
            System.out.printf("Modulo of two numbers is " + (num1 % num2));
        else
            System.out.printf("Please Enter a valid operrator");

    }
}
