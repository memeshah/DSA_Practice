package com.Kunal.functions;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        System.out.println("Enter your age to check if you are eligible to vote.");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if(age<1){
            System.out.println("enter the valid age.");
        }
        if(age>=18){
            System.out.println("Eligible.");
        }else{
            System.out.println("Not Eligible");
        }

    }
}
