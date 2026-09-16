package com.learning.day6;

public class Student {

    String name;

    int age;

    Student(String name, int age){

        this.name = name;

        this.age = age;

    }
    public static void main(String[] args) {
        Student student = new Student("John", 20);
        System.out.println("Name: " + student.name);      
        System.out.println("Age: " + student.age);
    }

}
