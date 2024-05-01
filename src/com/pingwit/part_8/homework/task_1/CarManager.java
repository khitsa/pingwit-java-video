package com.pingwit.part_8.homework.task_1;

public class CarManager {
    private Car[] cars;

    public CarManager(Car[] cars) {
        this.cars = cars;
    }

    public void openAudiDoors() {
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase("Audi")) {
                System.out.println(car.getBrand() + " " + car.getModel());
                for (int i = 1; i <= car.getNumberOfDoors(); i++) {
                    System.out.println("Дверь" + i + "открыта");
                }
            }
        }
    }
}
