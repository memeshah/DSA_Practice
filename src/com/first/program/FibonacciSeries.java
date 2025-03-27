package com.first.program;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter n to generate Fibonacci Series.");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int first = 0;
        int second = 1;
        System.out.println(first+"\n"+second);
        for (int i = 2; i < n; i++) {
            int nextterm = second + first;
            first = second;
            second = nextterm;
            System.out.println(second);

        }
    }
}
