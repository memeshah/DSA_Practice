package com.Kunal.conditionalloops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.println("Enter a number to find its factors.");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            if(a%i==0){
                System.out.print(i + " ");
            }
        }

    }
}
