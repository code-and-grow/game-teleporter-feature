package com.company;

public class Wolf extends WildAnimal {
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        System.out.println("Sinu valitud nimi: " + name + "ei võetud kasutusele. Hundil on alati standartne nimi: Brigitte Susanne");
        super.setName("BSH");
    }
}
