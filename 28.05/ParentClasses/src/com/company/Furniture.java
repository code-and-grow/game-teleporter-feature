package com.company;

public class Furniture {
    public double price;
    public String material;
    public boolean restored;

    public Furniture(int price, String material, boolean restored) {
        this.price = price;
        this.material = material;
        this.restored = restored;
    }

    public double getPriceInUSD() {
        double hind = this.price*1.1;
//        System.out.println("Furniture inUSD: " + hind);
        return hind;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isRestored() {
        return restored;
    }

    public void setRestored(boolean restored) {
        this.restored = restored;
    }
}
