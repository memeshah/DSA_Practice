package com.Kunal.conditionalloops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle.");
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        float area =(float) Math.PI*radius*radius;
        System.out.println("Area = "+area);
    }
}
