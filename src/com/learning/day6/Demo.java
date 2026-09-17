package com.learning.day6;

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        System.out.println("Human constructor called");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human human = new Human("Alice", 30);
        Human human1 = new Human("azs", 23);
        Human human2 = new Human("hhh", 44);
        System.out.println("Name: " + human.getName());
        System.out.println("Age: " + human.getAge());
    }
}
