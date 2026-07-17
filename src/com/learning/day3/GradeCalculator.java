package com.learning.day3;

public class GradeCalculator {
    public static void main(String[] args) {
        int marks = 75;
        if(marks >= 75){
            System.out.println("distinction");
        } else if(marks <= 60) {
            System.out.println("first class");
        } else if(marks <=55) {
            System.out.println("passed");
        } else {
            System.out.println("fail");
        }
    }
}
