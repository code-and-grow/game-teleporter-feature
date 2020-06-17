package com.company.character;

public class Player extends Character {
    private static double health;

    public Player(String name, CharacterType type) {
        super(name, type, "X");
        health = 3;
    }

    public static double getHealth() {
        return health;
    }

    public static void setHealth(double health) {
        Player.health = health;
    }
}
