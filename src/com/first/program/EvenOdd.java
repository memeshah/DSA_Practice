package com.first.program;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it prime or not.");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Even");
            return;
        }
        else
        {
            System.out.println("Odd");
            return;
        }

    }
}
