package com.company;

public class Cat extends Pet {
    private boolean hasFur;

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public void catchMouse() {
        System.out.println("Püüdsin hiire kinni");
    }

    public void eat() {
        System.out.println("Söön kassitoitu");
    }

    @Override
    public String toString() {
        return super.toString() + ", mul on karv: " + this.hasFur;
    }
}
