package com.Kunal.functions;

import java.util.Scanner;

public class MaxMin3Numbers {
    public static void main(String[] args) {
        System.out.println("Enter 3 number to get its Max and Min");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("Max is : "+max(a,b,c));
        System.out.println("Min is : "+min(a,b,c));
    }

    private static int max(int a, int b, int c) {
        int max = a;
        if(b>a){
            max  = b;
        }
        if(c>a){
            max = c;
        }
        return max;
    }
    private static int  min(int a, int b, int c) {
        int min = a;
        if(b<min){
            min = b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }
}
