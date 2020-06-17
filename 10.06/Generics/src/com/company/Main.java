package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("1");
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//        items.add(6);
//
//        for (int i:items) {
//            System.out.println(i);
//        }
        Car audi = new Car("audi");
        Motorcycle harley = new Motorcycle("harley");
        Plane boeing = new Plane("boeing");

        Fleet<Car> carFleet = new Fleet<>();
        carFleet.addToFleet(audi);

        Fleet<Motorcycle> motorcycleFleet = new Fleet<>();
        motorcycleFleet.addToFleet(harley);

        Fleet<Plane> planeFleet = new Fleet<>();
        planeFleet.addToFleet(boeing);
        planeFleet.addToFleet(boeing);


        System.out.println(Fleet.getFirstElement(items));
//        for (T v: fleet.getFleetVehicles()) {
//            System.out.println(v);
//        }


    }
}
