package com.osmbiradar.Basic_IO;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //TODO: "Input a year and find whether it is a leap year or not."

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year%4 == 0 && year%100!=0) || (year%400==0)){
            System.out.printf("Leap year");
        }
        else{
            System.out.printf("Not a Leap year");
        }

    }
}
