package com.Kunal.basicprograms;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        System.out.println("Please Enter your name :");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hi "+name+ ". How are you doing today..?");

    }

}
