package com.pingwit.part_7.homework.task_2;

public class Person {
    private String name;
    private int age;

    // конструктор с аргументами
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // консруктор без аргументов
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // блок инцилизпции
    {
        System.out.println("Создан новый экземляр класса Person");
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // создание экземпляра класса Person с аргументами
        Person person1 = new Person("Egorka", 23);
        System.out.println("Имя: " + person1.getName() + "Возраст: " + person1.getAge());

        // создание экземпляра классам Person без аргументов
        Person person2 = new Person();
        System.out.println("Имя: " + person2.getName() + "Возраст: " + person2.getAge());

    }

}
