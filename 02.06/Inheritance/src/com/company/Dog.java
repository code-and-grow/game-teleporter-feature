package com.company;

public class Dog extends Pet {
    private int age;

    public void eat() {
        System.out.println("Söön kasse");
    }


    public int getDogAge() {
        return age;
    }

    public void setDogAge() {
        this.age = super.getAge()*7;
    }

    @Override
    public String toString() {
        setDogAge();
        return super.toString() + ", Minu tegelik vanus on: " + age;
    }
}
