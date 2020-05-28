package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ütle kood: ");
        int code2 = Integer.parseInt(scanner.nextLine());
        if (code2 == 1234) {
            System.out.println("Kood oli 1234");
        } else if (code2 == 4321) {
            System.out.println("Kood oli 4321");
        } else {
            System.out.println("Default blokk");
        }

        System.out.println("Ütle kood 2: ");
        int code = Integer.parseInt(scanner.nextLine());
        switch (code){
            case 4321:
                System.out.println("Kood oli 4321");
                break;
            case 1234:
                System.out.println("Kood oli 1234");
                break;
            default:
                System.out.println("Default blokk");
        }


        System.out.println("Ütle esimene number: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ütle teine number: ");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ütle kolmas number: ");
        int number3 = Integer.parseInt(scanner.nextLine());
        int sum = number1 + number2;
        int totalSum = number1 + number2 + number3;
        if (sum % 2 == 0) {
            System.out.println("Summa on paaris");
            numberSize(sum);
        } else {
            System.out.println("Summa on paaritu");
            numberSize(sum);
        }
    }

    private static void numberSize(int sum) {
        if (sum > 10) {
            System.out.println("Summa on suurem kui 10");
        } else if (sum <= 10 && sum > 5) {
            System.out.println("Summa on väiksem / võrdne 10 ja suurem kui 5");
        } else {
            System.out.println("Summa on väiksem kui 5");
        }
    }
}
