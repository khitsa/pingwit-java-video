package com.pingwit.part_10.point_1;

public class Audi implements Car, Engine {

    private static final String PRODUCER = "Audi";

    private int CurrentTransmission = 0;

   @Override
    public void move() {
       System.out.println("Audi is moving");
   }

   @Override
    public String getProducer() {
       return PRODUCER;
   }

   public int getCurrentTransmission() {
       return  CurrentTransmission;
   }


}
