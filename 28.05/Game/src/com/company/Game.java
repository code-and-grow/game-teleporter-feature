package com.company;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
	    // Mängu käima panemine

        Character player = new Character("Mihkel", CharacterType.WARRIOR);
        System.out.println(player);

        player.changeDirection(Direction.LEFT);
        player.move();
        player.move();
        player.move();

        player.move();

        String input = "";
        Scanner scanner = new Scanner(System.in);
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
        }
    }
}
