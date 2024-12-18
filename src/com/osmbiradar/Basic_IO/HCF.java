package com.osmbiradar.Basic_IO;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
       // TODO: Take 2 numbers as inputs and find their HCF and LCM.

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while(num2 !=0)
        {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        System.out.println("HCF = "+ num1);
    }
}
