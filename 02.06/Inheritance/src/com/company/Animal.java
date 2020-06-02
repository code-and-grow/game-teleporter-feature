package com.company;

public class Animal extends Object {
    private String name;
    private String breed;
    private int age;
    private double weight;
    private boolean isAlive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void eat() {
        System.out.println("Söön toitu");
    }

    public String sleep() {
        return "Magan metsas";
    }

    @Override
    public String toString() {
        return "Olen loom: " +
                "nimega - " + name + '\'' +
                ", mu tõug on - " + breed + '\'' +
                ", vanusega - " + age +
                ", kaaluga - " + weight +
                ", elan veel: " + isAlive;
    }
}
