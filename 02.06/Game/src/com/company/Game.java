package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        World world = new World(30, 10);

        Character player = new Character("Mihkel", CharacterType.WARRIOR, "X");
        Character enemy = new Character("Enemy", CharacterType.WIZARD, "Z");
        Character friend = new Character("Friend", CharacterType.HERO, "O");

        world.setCharacters(Arrays.asList(player, enemy, friend));
//        List charachterList = new ArrayList();
//        charachterList.add(player);
//        charachterList.add(enemy);
//        charachterList.add(friend);
//        world.setCharacters(charachterList);

        String input = "";
        Scanner scanner = new Scanner(System.in);

        world.render();
        while(!input.equals("end")){
            input = scanner.nextLine();
            if (input.equals("w")){
                Direction playerDirection = Direction.UP;
                player.changeDirection(playerDirection);
                System.out.println("kasutaja liikus: " + playerDirection);
                player.move();
            } else if  (input.equals("s")){
                player.changeDirection(Direction.DOWN);
                System.out.println("kasutaja liikus: " + player.getDirection());
                player.move();
            } else if  (input.equals("a")){
                player.changeDirection(Direction.LEFT);
                System.out.println("kasutaja liikus: " + player.getDirection());
                player.move();
            } else if  (input.equals("d")){
                player.changeDirection(Direction.RIGHT);
                System.out.println("kasutaja liikus: " + player.getDirection());
                player.move();
            } else if  (input.equals("")){
                player.move();
            }
            world.render();
        }
    }
}
