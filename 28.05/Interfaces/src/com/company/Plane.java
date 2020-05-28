package com.company;

public class Plane extends Car implements Vehicle {
    private boolean isUp;

    @Override
    public void drive() {
        this.isUp = true;
        System.out.println("On õhus = " + isUp);
    }

    @Override
    public void steer() {

    }

    @Override
    public void move() {
        super.move();
        System.out.println(doors);
    }


}
