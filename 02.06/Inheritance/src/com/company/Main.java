package com.company;

public class Main {

    public static void main(String[] args) {
//	    Dog beethoven = new Dog();
//	    beethoven.setAge(6);
//	    beethoven.setBreed("beethonven");
//	    beethoven.setAlive(true);
//	    beethoven.setOwner("John");
//        System.out.println(beethoven);
//
//        beethoven.eat();
//		System.out.println(beethoven.sleep());

		Wolf wolf = new Wolf();
		System.out.println(wolf);
		wolf.setName("Hunt");
		System.out.println(wolf);

		Animal animal = new Animal();
		animal.setName("Random");
		System.out.println(animal.getName());
		System.out.println(animal);
    }
}
