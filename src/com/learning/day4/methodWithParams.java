package com.learning.day4;

public class methodWithParams {
    public static void greetPerson(String name){
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
    }
    public static void main(String[] args){
        greetPerson("Alice");
        greetPerson("Bob");
        greetPerson("Charlie");
    }
}
