package com.osmbiradar.Basic_IO;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {

        // TODO: Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

        Scanner sc = new Scanner(System.in);
        String input;
        int sum = 0;

        while (true) {
            input = sc.next();
            if (input.equals("x")) {
                System.out.println("Sum of all numbers: " + sum);
                break;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    sum += number;
                } catch (NumberFormatException ex) {
                    System.out.println("Please Enter a valid number or x to stop");
                }
            }
        }

    }
}
