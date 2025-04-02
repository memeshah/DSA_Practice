package com.Kunal.functions;

import java.util.Scanner;

public class PalindromeCheckNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int temp = a;
        int rev=0;
        while(temp>0){
            int last = temp%10;
            rev = rev*10+last;
            temp/=10;
        }
        if(rev==a){
            System.out.println(a+" is a Palindrome.");
        }else {
            System.out.println(a+" is not a Palindrome.");
        }
    }
}
