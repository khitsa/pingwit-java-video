package com.pingwit.part_8.homework.task_1;

public class Car {
    private String brand;
    private String model;
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        this.brand = brand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    // Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}





