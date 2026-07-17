package com.learning.day3;

public class SumOfNumbers {
    public static void main(String[] args){
        int num=500;
        int total = 0;
        for(int i = num; i>=0; i--){
            total = total+i;
        }
        System.out.println(total);
    }
}
