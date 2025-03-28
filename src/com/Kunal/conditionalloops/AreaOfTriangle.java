package com.Kunal.conditionalloops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Please enter a base and height of a triangle.");
        Scanner input = new Scanner(System.in);
        float base = input.nextFloat();
        float height = input.nextFloat();
        float area = (float)(0.5*base*height);
        System.out.println("Area of a triangle is : "+area);
    }
}
