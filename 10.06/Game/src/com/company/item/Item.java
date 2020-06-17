package com.company.item;

public class Item {
    private String name;
    private double strength;
    private int endurance;
    private int level;
    private ItemType itemType;

    public Item(String name, double strength, int endurance) {
        this.name = name;
        this.strength = strength;
        this.endurance = endurance;
        this.level = 1;
        this.itemType = getRandomItemType();
//        getRandomItempType();
    }

    private ItemType getRandomItemType() {
       return ItemType.STANDARD;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " tugevusega " + strength*1 + ". Kasutuskordi: " + endurance;
    }
}
