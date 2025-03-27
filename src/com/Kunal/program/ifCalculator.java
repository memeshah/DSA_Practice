package com.Kunal.program;

import java.util.Scanner;

public class ifCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 number to perform calculation");
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.println("Please provide an operator you want to perform");
        String operator = input.next();
        if(operator.equals("+")){
            System.out.println(a+" + "+  b + " = " + (a+b));
        } else if (operator.equals("-")) {
            System.out.println(a+" - "+  b + " = " + (a-b));
        } else if (operator.equals("*")) {
            System.out.println(a+" * "+  b + " = " + (a*b));
        } else if (operator.equals("/")) {
            System.out.println(a+" / "+ b+ " = " + (a/b));
        }else {
            System.out.println("Invalid Operator has been added.");
        }
    }
}
