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

    private static void setHealth(double health) {
        Player.health = health;
    }

    public static void takeHealth() {
        Player.setHealth(Player.getHealth()-1);
    }

    public static void setFullHealth() {
        Player.setHealth(10);
    }
}
