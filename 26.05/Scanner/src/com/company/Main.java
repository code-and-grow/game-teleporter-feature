package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        int number1 = Integer.parseInt(input1);
        int number2 = Integer.parseInt(input2);
        int sum = number1 + number2; // <----
        System.out.println(number1 + number2 + "Kahe arvu summa: ");

        System.out.printf("%d ja %d arvu %s on %d %n", number1, number2, "summa", number1+number2);

        // lahutamine
        // jagamine
        // korrutamine

        System.out.printf("%d ja %d arvu %s on %.1f %n", number1, number2, "jagatis", number1/(double)number2);

        // jagamisel on oluline Double (castimine) (double)
        // double.parseDouble()

    }
}
