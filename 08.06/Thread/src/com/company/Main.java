package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("asdas");
//        Main.calculate();
        calculate();

        Dog taxi = new Dog();
        Dog.bark();
        taxi.sit();
        Dog.bark();
        taxi.sit();
        taxi.setName("Taxikoera nimi");

        Dog beethoven = new Dog();
        beethoven.setName("Beethoven");

        System.out.println(taxi.getName());
        System.out.println(beethoven.getName());
    }

    public static void calculate() {
        System.out.println("Kalkuleerin");
    }
}
