package com.company;

public class WildAnimal extends Animal {

    @Override
    public String getName() {
        System.out.println("Metsloomadel nimesid ei ole");
        return "N/A";
    }

    @Override
    public void setName(String name) {
        if (name.equals("BSH")) {
            super.setName(name);
        } else {
            System.out.println("Metsloomadel nimesid ei ole");
        }
    }
}
