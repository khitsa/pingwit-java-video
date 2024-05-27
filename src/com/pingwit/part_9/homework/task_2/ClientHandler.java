package com.pingwit.part_9.homework.task_2;

public class ClientHandler {
    public void suggestDatingService(Person person) {
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - person.getBirthYear();

        if (age > 18 && person.getMaritalStatus() == Person.MaritalStatus.SINGLE) {
            if (person.getGender() == Person.Gender.MALE) {
                System.out.println("Уважаемый " + person.getFirstName() + ", желаете ли познакомиться с девушкой?");
            } else {
                System.out.println("Уважаемая " + person.getFirstName() + ", мы поможем вам найти мужчину мечты!");
            }
        }
    }
}

