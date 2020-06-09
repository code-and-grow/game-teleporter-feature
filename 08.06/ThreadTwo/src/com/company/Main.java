package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    SecondThread secondThread = new SecondThread();
	    secondThread.setName("secondThread");
	    secondThread.start();


	    Thread thirdThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello from third");
			}
		});

	    thirdThread.start();

	    thirdThread.join();

	    thirdThread.interrupt();
    }


}
