package com.pingwit.part_7;

public class Student {
    String name;
    String surname;
    int age;
    double height;

    public Student(String name, String surname) {
        System.out.println("Hello from constructor");
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
        this("RandomName", "RandomSurname");
        System.out.println("Hello from default constructor");
    }
}
