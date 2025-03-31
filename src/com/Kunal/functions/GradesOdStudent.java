package com.Kunal.functions;

import java.util.Scanner;

public class GradesOdStudent {
    public static void main(String[] args) {
        System.out.println("Enter the marks of a student out of 100.");
        Scanner in = new Scanner(System.in);
        float marks = in.nextFloat();
        System.out.println(gradeOfStudent(marks));
    }

    private static String gradeOfStudent(float marks) {
        String grade="Fail";
        if(marks<0 || marks>100){
            grade="Invalid marks entered.";
        }else if(marks>=91){
            grade="AA";
        }else if(marks>=81){
            grade="AB";
        }else if(marks>=71){
            grade="BB";
        }else if(marks>=61){
            grade="BC";
        }else if(marks>=51){
            grade="CD";
        }else if(marks>=41){
            grade="DD";
        }

        return grade;
    }
}
