package com.osmbiradar.Basic_IO;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        //TODO Take 2 numbers as inputs and find their LCM.

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        // LCM = (a*b) / hcf(a,b)

        while (b!=0)
        {
            int rem = a%b;
            a = b;
            b = rem;
        }

        int hcf = a;


        // now using the  above calculated HCF we can easily calculate the LCM

        int lcm = (num1*num2)/hcf;


        System.out.println("HCF : " + hcf);
        System.out.println("LCM : " + lcm);
    }
}
