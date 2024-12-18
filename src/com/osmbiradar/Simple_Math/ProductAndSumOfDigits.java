package com.osmbiradar.Simple_Math;

import java.util.Scanner;

public class ProductAndSumOfDigits {
    public static void main(String[] args) {

        //TODO: Subtract the Product and Sum of Digits of an Integer
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number...");
        int number = sc.nextInt();
        int sum = 0 ;
        int product = 1;

        while (number>0){
            int digit = number % 10;
            sum += digit;
            product *= digit;

            number /= 10;
        }

        System.out.println("Sum of the digits of given number :"+sum);
        System.out.println("Product of the digits of given number :"+product);
    }
}
