package com.pingwit.part_9.homework.task_2;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Савелий", "Иванов", 1990, Person.Gender.MALE, Person.MaritalStatus.SINGLE),
                new Person("Виолетта", "Петрова", 2000, Person.Gender.FEMALE, Person.MaritalStatus.SINGLE),
                new Person("Алексей", "Сидоров", 2005, Person.Gender.MALE, Person.MaritalStatus.SINGLE),
                new Person("Анна", "Смирнова", 1985, Person.Gender.FEMALE, Person.MaritalStatus.MARRIED)
        };

        ClientHandler handler = new ClientHandler();
        for (Person person : persons) {
            handler.suggestDatingService(person);
        }
    }
}

