package com.company;

public class Chair extends Furniture {
    public double price;

    public Chair(int price, String material, boolean restored) {
        super(price, material, restored);
        System.out.println("Chair constructor price: " + price);
        System.out.println("Chair this.price: " + this.price);
        getPriceInUSD();
    }

    @Override
    public double getPrice() {
        getPriceInUSD();
        System.out.println("Chair getPrice:" + this.price);
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
