package com.osmbiradar.Simple_Math;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        // TODO To calculate Fibonacci Series up to n numbers.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valur for N");
        int n = sc.nextInt();

        long f1 = 0;
        long f2 = 1;

        if (n >= 2)
            System.out.print(f1 + "," + f2);

        for (int i = 3; i <= n; i++) {
            long f3 = f1 + f2;
            System.out.printf("," + f3);
            f1 = f2;
            f2 = f3;
        }


        // TODO: Find the nth term of Fibonacci series
        System.out.println("Enter value for M");
        int m = sc.nextInt();
        long a = 0;
        long b = 1;

        if (m == 1)
            System.out.print(a);
        else if (m == 2)
            System.out.print(b);
        else
            for (int i = 3; i <= m; i++) {
                long c = a + b;
                a = b;
                b = c;
            }
        System.out.println(b);
    }
}
