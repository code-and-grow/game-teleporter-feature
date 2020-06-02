package com.company;

import java.util.List;

public class World {
    private int width;
    private int height;
    List<Character> characters;

    public World(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    void render () {
        String symbol = "";

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || y == height - 1) {
                    symbol = "-";
                } else if (x == 0 || x == width - 1) {
                    symbol = "|";
                } else {
                    symbol = " ";
                }

                for (Character c: characters) {
                    if (c.getxCoord() == x && c.getyCoord() == y) {
                        symbol = c.getSymbol();
                    }
                }

                System.out.print(symbol);
            }
            System.out.println("");
            symbol = "";
        }
    }
}
