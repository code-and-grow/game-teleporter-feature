package com.company;

public class Dog {
    private static String name;
    private int jalgadeArv = 4;

    // Ei kasuta ühtegi muutujat ja kõikidele koertele ühine
    public static void bark(){
        System.out.println("Haugun");
    }

    public void sit(){
        System.out.println(this.jalgadeArv);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
