package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }

        int j = 0;
        while (j<5){
            j++;
            System.out.println("Hello from while");
        }


        for (; j < 5;) {

        }


        do {
            System.out.println("Kas tahad mängida?");
        } while (answer=="ei") {

        }
    }
}
