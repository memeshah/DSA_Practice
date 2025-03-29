package com.Kunal.conditionalloops;

import java.util.Scanner;

public class TrickSumOfNumbers {
    public static void main(String[] args) {
        System.out.println("we will be providing sum of the all the numbers user enters till user enter 0. So please continue providing numbers till you want sum and then press 0.");
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int sum=0;
        while(n!=0){
            sum+=n;
            n=input.nextInt();
        }
        System.out.println(sum);
    }
}
