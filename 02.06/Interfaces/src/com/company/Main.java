package com.company;

public class Main {

    public static void main(String[] args) {
	    EstPersonalCode eesti1 = new EstPersonalCode("39006021234");
        System.out.println(eesti1.getSugu());

        System.out.println(eesti1.isHuman());
    }
}
