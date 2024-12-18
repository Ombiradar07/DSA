package com.osmbiradar.Basic_IO;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // TODO: Take two numbers and print the sum of both

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.printf("Some of "+num1+" and "+num2+" is "+sum);
    }
}
