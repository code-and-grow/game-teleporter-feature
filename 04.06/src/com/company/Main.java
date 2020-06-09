package com.company;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        // NumberformatException
        int input = 0;
        try {
            input = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            Logger logger = Logger.getLogger("src/blabbla");
            System.out.println("Numberformatexception!!!");
        }

        // ArithmeticException
        try {
            int sum =  7/input;
        } catch (ArithmeticException e) {
            System.out.println("Nulliga ei saa jagada!");
        } catch (Exception e) {
            System.out.println("Mingi muu error!");
        }

        // ArrayIndexOutOfBoundsException
        int[] numbers = new int[] {11,12,13,14};
        try {
            System.out.println(numbers[input]);
        }  catch (ArrayIndexOutOfBoundsException dasdas) {
            dasdas.printStackTrace();
            System.out.println("Massiivis ei ole nii palju elemente");
        }  catch (RuntimeException e) {
            System.out.println("Runtime error");
        }  catch (Exception e) {
            System.out.println("Üldine error");
        }
    }
}
