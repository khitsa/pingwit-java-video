package com.pingwit.part_7.homework.task_3;
/* Создайте массив, состоящий из объектов класса из 'Task 2'
Можно конечно создать дополнительный класс Person, но лучше удали и используй из 'Task 2'
*/
public class Person {
    private String name;
    private int age;

    // Конструктор с аргументами
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Конструктор без аргументов
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Блок инициализации
    {
        System.out.println("Создан новый экземпляр класса Person");
    }

    // Геттеры и сеттеры
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

    // Переопределение метода toString для удобного вывода информации о объекте - опечатки в комментариях не страшны, но все равно лучше не делать
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) { // лучше создавай отдельный класс методом main
        // Создаем массив объектов класса Person
        Person[] people = new Person[3];
        people[0] = new Person("Sasha", 22);
        people[1] = new Person("Ivan", 30);
        people[2] = new Person(); // Создаем объект с значениями по умолчанию

        // Выводим содержимое массива на экран
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
