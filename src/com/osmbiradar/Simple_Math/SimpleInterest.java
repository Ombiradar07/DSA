package com.osmbiradar.Simple_Math;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle amount,time, and rate of interest");
        float amount = sc.nextFloat();
        float time = sc.nextFloat();
        float roi = sc.nextFloat();


        float interest = (amount * time * roi)/100;
        System.out.println("Simple Interest = "+interest);

    }
}
