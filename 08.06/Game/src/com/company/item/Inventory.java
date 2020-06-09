package com.company.item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private int inventoryMaxSize = 10;
    List<Item> inventory = new ArrayList<>();

    public void addItem(Item item) {
        if (inventory.size() <= inventoryMaxSize) {
            inventory.add(item);
            System.out.println("Lisatud asjade hulka: " + item);
        } else {
            System.out.printf("Eset %s ei lisatud asjade hulka %n", item.getName());
        }
    }

    public void showInventory() {
        for (Item item: inventory) {
            System.out.println(item);
        }
    }
}
