package com.company;

public class Main {

    static String[] threadNames = {"Pets", "Anto", "Mihkel"};

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < threadNames.length; i++) {
            new Thread(getRunnable(), threadNames[i]).start();
            Thread.sleep(500);
        }


    }

    public static Runnable getRunnable() {
        return () -> {
            for (int i = 0; i < threadNames.length; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }



//    Dog taxi = new Dog();
//    taxi.getAge();
//
//    Dog.getAge();

}
