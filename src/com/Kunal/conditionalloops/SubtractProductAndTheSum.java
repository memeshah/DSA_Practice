package com.Kunal.conditionalloops;

import java.util.Scanner;

public class SubtractProductAndTheSum {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int prod = prod(n);
//        System.out.println(prod);
        int sum = sum(n);
//        System.out.println(sum);
        int sub = prod-sum;
        System.out.println(sub);
    }
    static int sum(int n){
        int sum =0;
        while(n!=0){
            int last = n%10;
            sum+=last;
            n/=10;
        }
        return sum;
    }
    static int prod(int n){
        int prod =1;
        while(n!=0){
            int last = n%10;
            prod*=last;
            n/=10;
        }
        return prod;
    }
}
