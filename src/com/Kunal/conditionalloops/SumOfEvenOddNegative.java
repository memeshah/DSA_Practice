package com.Kunal.conditionalloops;

import java.util.Scanner;
/*Write a program to print the sum of negative numbers, sum of positive even numbers and
 the sum of positive odd numbers from a list of numbers (N) entered by the user.
 The list terminates when the user enters a zero.*/
public class SumOfEvenOddNegative {
    public static void main(String[] args) {
        System.out.println("Enter the negative and positive number numbers to get its sum categorizing even odd and negative. once done press 0.");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int negSum=0,evenSum=0,oddSum=0;
        while(a!=0){
            if(a<=0){
                negSum+=a;
            }else if(a%2==0){
                evenSum +=a;
            }else{
                oddSum +=a;
            }
         a=input.nextInt();
        }
        System.out.println("Sum of numbers are\n" +
                "Negatic : "+negSum+
                "\nEven : "+evenSum +
                "\nOdd : "+oddSum);
    }

}
