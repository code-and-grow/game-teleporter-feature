package com.company.item;

import com.company.character.Enemy;

public class Hammer extends Item implements Weapon {
    private static double strength;

    public Hammer() {
        super("Haamer", strength, 7);
    }

    @Override
    public void hit() {
        double healthLeft = Enemy.getHealth() - strength;
        Enemy.setHealth(healthLeft);
        System.out.println("Lõid haamriga");
    }
}
