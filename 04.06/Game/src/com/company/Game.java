package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.lang.Runnable;

public class Game {

    public static void main(String[] args) {
        World world = new World(30, 10);

//        Timer timer = new Timer();
//        int seconds = 0;

        Character enemy = new Character("Enemy", CharacterType.WIZARD, "Z", world.getHeight(), world.getWidth());
        Character friend = new Character("Friend", CharacterType.HERO, "O", world.getHeight(), world.getWidth());
        Character player = new Character("Mihkel", CharacterType.WARRIOR, "X", world.getHeight(), world.getWidth());

        int counter = 0;
        world.setCharacters(Arrays.asList(enemy, friend, player));
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
                player.move();
            } else if  (input.equals("s")){
                player.changeDirection(Direction.DOWN);
                player.move();
            } else if  (input.equals("a")){
                player.changeDirection(Direction.LEFT);
                player.move();
            } else if  (input.equals("d")){
                player.changeDirection(Direction.RIGHT);
                player.move();
            } else if  (input.equals("")){
                player.move();
            }
            boolean catched = false;
            if (player.getxCoord() == enemy.getxCoord() && player.getyCoord() == enemy.getyCoord()) {
                counter++;
                enemy.setVisible(false);
                catched = true;
            }
            if (player.getxCoord() == friend.getxCoord() && player.getyCoord() == friend.getyCoord()) {
                enemy.setVisible(true);
                enemy.randomiseCoordinates(1, world.getWidth()-1, world.getHeight()-1);
            }
            world.render();
            if (catched){
                System.out.println("Vaenlane käes!! Oled püüdnud vaenlasi: " + counter);
            }
        }

//                timer = new Timer();
//                timer.scheduleAtFixedRate(new TimerTask() {
//                    @Override
//                    public void run() {
//                        seconds++;
//                    }
//                }, 1000, 1000);

    }
}
