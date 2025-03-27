package com.first.program;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two number to get all armstrong numbers between them.");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        for (int i = n1+1; i < n2; i++) {
            int n = i;
            int remainder =0;
            int sum= 0;
            while (n!=0){
                remainder=n%10;
                sum += remainder*remainder*remainder;
                n /=10;
            }
            if(i==sum){
                System.out.println(sum);
            }
        }

    }
}
