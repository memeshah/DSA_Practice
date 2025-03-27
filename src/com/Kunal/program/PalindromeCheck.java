package com.Kunal.program;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Enter a string to check if it is palindrome.");
        Scanner input = new Scanner(System.in);
        String aString= input.next();
        String rev = "";
        for (int i = 0; i < aString.length(); i++) {
            rev += aString.charAt(aString.length()-i-1);
        }
        if(rev.equals(aString)){
            System.out.println("its a palindrome.");
        }else {
            System.out.println("Its not a palindrome.");
        }
    }
}
