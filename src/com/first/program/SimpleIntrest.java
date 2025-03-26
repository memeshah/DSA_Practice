package com.first.program;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Principal amount :");
        float principal = input.nextFloat();
        System.out.println("Enter R.O.I :");
        float intrest = input.nextFloat();
        System.out.println("Enter number of year :");
        int noOfYear = input.nextInt();
        System.out.println("Provided Details are :" );
        System.out.println("Principal "+ principal);
        System.out.println("Intrest "+ intrest);
        System.out.println("No Of Year "+ noOfYear);

        float SI = (principal*intrest*noOfYear)/100;
        System.out.println("SI = "+SI);
    }
}
