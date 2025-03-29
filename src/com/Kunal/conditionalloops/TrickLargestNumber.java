package com.Kunal.conditionalloops;

import java.util.Scanner;

public class TrickLargestNumber {
    public static void main(String[] args) {
        System.out.println("Provide numbers till you want largest of it and then press 0.");
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int larget=0;
        while(n!=0){
            if(n>larget){
                larget=n;
            }
            n=input.nextInt();
        }
        System.out.println(larget);
    }
}
