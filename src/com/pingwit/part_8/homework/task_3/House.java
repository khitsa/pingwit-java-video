package com.pingwit.part_8.homework.task_3;

public class House {
    private int floors;
    private int residents;
    private boolean heatingOn;

    public House(int floors, int residents) {
        this.floors = floors;
        this.residents = residents;
        this.heatingOn = false;
    }

    public int getFloors() {
        return floors;
    }

    public int getResidents() {
        return residents;
    }

    public void turnHeatingOn() {
        this.heatingOn = true;
        System.out.println("Heating turned on for house with " + floors + " floors and " + residents + " residents.");
    }

    public boolean isHeatingOn() {
        return heatingOn;
    }
}

