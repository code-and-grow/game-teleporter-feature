package com.company;

public class Main {

    public static void main(String[] args) {
	    Furniture furniture = new Furniture(100, "puit", true);
	    Chair chair = new Chair(50, "raud", false);

        System.out.println("Main function chair.price 1: " + chair.price);
        System.out.println("Main function chair.getPrice() 1: " + chair.getPrice());
        System.out.println("Main function chair.getPriceInUSD() 1: " + chair.getPriceInUSD());

        // misiarel justkui muudaks chair'i hinna aga
        chair.setPrice(30.00);
        // kui seda kusida labi .price vatiku sits on tulemuseks vana hind. Aga ...
        System.out.println("Main function chair.price 2: " + chair.price);

        // kui kOsida hinda labi .getPrice() valiku, sits on uus hind kuvatud?!?
        System.out.println("Main function chair.getPrice() 2: " + chair.getPrice());
        System.out.println("Main function chair.getPriceInUSDO 2: " + chair.getPriceInUSD());
        // chair.price RiAgla !igggagg 0.4
        System.out.println("Main function chair.price 3: " + chair.price);
    }
}
