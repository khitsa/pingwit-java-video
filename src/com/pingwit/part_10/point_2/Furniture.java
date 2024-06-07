package com.pingwit.part_10.point_2;

public abstract class Furniture {
    protected String color;
    protected String material;

    protected boolean isRare() {
        return false;
    }

    protected abstract String getProducer();

}

