package com.osmbiradar.Simple_Math;

import java.util.Scanner;

public class CurrencyConversion {

    public static void main(String[] args) {

        // TODO: Input currency in rupees and output in USD.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount in Rupeees");

        float rupees = sc.nextFloat();
        final double exchangeRate = 84.955;


        System.out.println("The amount in USD is  : " + (rupees / exchangeRate));
    }
}
