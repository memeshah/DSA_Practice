package com.Kunal.conditionalloops;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        System.out.println("Enter the length and breadth of a rectangle :");
        Scanner input = new Scanner(System.in);
        float l = input.nextFloat();
        float b = input.nextFloat();
        float area = l * b;
        System.out.println("Area of a Rectagnle is :"+area);
    }
}
