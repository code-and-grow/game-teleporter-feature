package com.company;

import com.company.character.Character;

import java.util.List;

public class World {
    private static int width;
    private static int height;
    List<Character> characters;

    public World(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    void render () {
        restrict();

        String symbol = "";

        for (int y = 0; y <= height; y++) {
            for (int x = 0; x <= width; x++) {
                if (y == 0 || y == height) {
                    symbol = "-";
                } else if (x == 0 || x == width) {
                    symbol = "|";
                } else {
                    symbol = " ";
                }

                for (Character c: characters) {
                    if (c.isVisible() && c.getxCoord() == x && c.getyCoord() == y) {
                        symbol = c.getSymbol();
                    }
                }

                System.out.print(symbol);
            }
            System.out.println("");
            symbol = "";
        }
    }

    private void restrict() {
        Character c = characters.get(characters.size()-1);

        int xCoord = c.getxCoord();
        int yCoord = c.getyCoord();
        if (c.getxCoord() == 0) {
            c.setxCoord(xCoord+1);
        } else if (c.getyCoord() == 0) {
            c.setyCoord(yCoord+1);
        } else if (c.getxCoord() == width) {
            c.setxCoord(xCoord-1);
        } else if (c.getyCoord() == height) {
            c.setyCoord(yCoord-1);
        }
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
}
