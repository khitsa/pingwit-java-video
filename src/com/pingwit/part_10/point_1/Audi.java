package com.pingwit.part_10.point_1;

public class Audi implements Car {

    private static final String PRODUCER = "Audi";
   @Override
    public void move() {
       System.out.println("Audi is moving");
   }

   @Override
    public String getProducer() {
       return "Audi";
   }
}
