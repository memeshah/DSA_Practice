package com.Kunal.basicprograms;

import java.util.Scanner;

public class RupeedUSDCalculator {
    public static void main(String[] args) {
        System.out.println("Enter amount in rupees to get in USD");
        Scanner input = new Scanner(System.in);
        float rupees = input.nextFloat();
        float USD = rupees*85.66f;
        System.out.println("Amount in USD is :"+USD);

    }
}
