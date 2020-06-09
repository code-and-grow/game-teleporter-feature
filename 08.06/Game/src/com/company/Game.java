package com.company;

import com.company.character.*;
import com.company.item.Hammer;
import com.company.item.Sword;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        World world = new World(30, 10);

// TODO: timer
        Enemy enemy = new Enemy("Enemy", CharacterType.WIZARD);
        Friend friend = new Friend("Friend", CharacterType.HERO);
        Player player = new Player("Mihkel", CharacterType.WARRIOR);

        // Composition
        player.getInventory().addItem(new Hammer());
        player.getInventory().addItem(new Sword());
        player.getInventory().showInventory();
        world.setCharacters(Arrays.asList(enemy, friend, player));

        moveCharacters(world, enemy, friend, player);
    }

    private static void moveCharacters(World world, Enemy enemy, Friend friend, Player player) throws InterruptedException {
        String input = "";
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
                enemy.setVisible(false);
                catched = true;
            }
            if (player.getxCoord() == friend.getxCoord() && player.getyCoord() == friend.getyCoord()) {
                enemy.setVisible(true);
                enemy.randomiseCoordinates(1, World.getWidth()-1, World.getHeight()-1);
            }
            world.render();
            if(catched){
                enemyCatched(player);
            }
        }
    }

    private static void enemyCatched(Player player) throws InterruptedException {
        System.out.println("Kohtusid vaenlasega! Kas soovid temaga võidelda? Y/N: ");
        String input = scanner.nextLine().toLowerCase();
        if (input.equals("y")) {
            System.out.println("Algas lahing");
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println("Sul on järgmine valik relvi: ");
            TimeUnit.MILLISECONDS.sleep(1000);
            player.getInventory().showInventory();
            System.out.println("Vali number millist relva kasutad: ");
            input = scanner.nextLine();
            // TODO: input tuleb stringina, teeme integeriks ning küsime inventory listist
            // peab olema try / catch bloki vahel kui sisestatakse täht
            System.out.println("Valisid relva: " + input);
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println("Hakkasid võitlema!!");
            TimeUnit.MILLISECONDS.sleep(1000);
            counter++;
            System.out.println("Vaenlane käes!! Oled püüdnud vaenlasi: " + counter);
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println("Liigu edasi: ");
        } else {
            System.out.println("Põgenesid vaenlase eest!");
            System.out.println("Liigu edasi: ");
        }
    }
}
