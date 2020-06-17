package com.company;

import java.util.ArrayList;
import java.util.List;

public class Fleet<T extends Vehicles> {
    private ArrayList<T> fleetVehicles = new ArrayList<>();

    public boolean addToFleet(T vehicles) {
        if (fleetVehicles.contains(vehicles)) {
            System.out.println(((Vehicles)vehicles).getBrand() + " on juba liikluses");
            return false;
        } else {
            fleetVehicles.add(vehicles);
            System.out.println(((Vehicles)vehicles).getBrand() + " lisati liiklusesse");
            return true;
        }
    }

    public ArrayList<T> getFleetVehicles() {
        return fleetVehicles;
    }

    public static <T> T getFirstElement(List<T> list) {
        return list.get(0);
    }
}
