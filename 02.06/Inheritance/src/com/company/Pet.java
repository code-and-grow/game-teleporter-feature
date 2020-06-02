package com.company;

public class Pet extends Animal  {
    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String sleep() {
        return "Magan kodus";
    }

    @Override
    public String toString() {
        return super.toString() + ", minu omanik on: " + this.owner;
    }
}
