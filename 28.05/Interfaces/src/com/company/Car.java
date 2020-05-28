package com.company;

public class Car implements Vehicle {
    public int doors;

    @Override
    public void drive() {
        System.out.println("SÕidab");
    }

    @Override
    public void steer() {
        System.out.println("Keerab");
    }


    public void move() {

    }
}
