package com.osmbiradar.Basic_IO;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // TODO Take a number as input and print the multiplication table for it.

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i=1;i<=10;i++)
        {
            System.out.println(number + " * "+ i + " = " + number*i);
        }
    }
}
