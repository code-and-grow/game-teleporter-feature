package com.company.kaks;

public class Number {
    private static int number;
    private String name;

    public Number(String name) {
        this.name = name;
        number++;
    }

    public static int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
