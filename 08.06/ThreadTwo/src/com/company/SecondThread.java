package com.company;

public class SecondThread extends Thread {

    @Override
    public void run(){
        System.out.println("Hello from " + currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
