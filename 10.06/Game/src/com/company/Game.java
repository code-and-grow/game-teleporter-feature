package com.company;

import com.company.character.*;
import com.company.item.Hammer;
import com.company.item.Item;
import com.company.item.Sword;
import com.company.item.Boot;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        World world = new World(10, 5);

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
                enemySeen(player);
            }
        }
    }

    private static void enemySeen(Player player) throws InterruptedException {
        System.out.println("Kohtusid vaenlasega! Kas soovid temaga võidelda? Y/N: ");
        String input = scanner.nextLine().toLowerCase();
        if (input.equals("y")) {
            System.out.println("Algas lahing");
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println("Sul on järgmine valik relvi: ");
            TimeUnit.MILLISECONDS.sleep(100);
            player.getInventory().showInventory();
            System.out.println("Vali number millist relva kasutad: ");
            Item chosenWeapon = getFightWeapon(player);
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println("Hakkasid võitlema!!");
            while (Player.getHealth()>0 || Enemy.getHealth()>0) {
                if(Player.getHealth()<=0 || Enemy.getHealth()<=0){
                    break;
                }
                System.out.println(Player.getHealth());
                System.out.println(Enemy.getHealth());
                fightEnemy(chosenWeapon);
            }
            TimeUnit.MILLISECONDS.sleep(100);
            counter++;
            System.out.println("Vaenlane käes!! Oled püüdnud vaenlasi: " + counter);
            Enemy.reboost();
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println("Liigu edasi: ");
        } else {
            System.out.println("Põgenesid vaenlase eest!");
            System.out.println("Liigu edasi: ");
        }
    }

    private static Item getFightWeapon(Player player) {
        String input;
        input = scanner.nextLine();
        Item chosenWeapon = null;
        while(chosenWeapon == null){
            try {
                chosenWeapon = player.getInventory().getInventory().get(Integer.parseInt(input)-1);
            } catch (NumberFormatException e) {
                System.out.println("Sisestasid numbri asemel tähe! Sisesta uuesti!");
                input = scanner.nextLine();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Sellise numbriga relva ei ole! Sisesta uuesti!");
                input = scanner.nextLine();
            }
        }
        System.out.println("Valisid relva: " + chosenWeapon.getName());

        return chosenWeapon;
    }

    private static void fightEnemy(Item chosenWeapon) {
        System.out.println(Player.getHealth());
        System.out.println(Enemy.getHealth());
        String input;
        System.out.println("Ütle number millega võitled vahemikus 1-3");
        input = scanner.nextLine();
//        String enemyNumber = String.valueOf(enemyFightRandomNumber());
        if(input.equals(String.valueOf(enemyFightRandomNumber()))){
            switch (chosenWeapon.getClass().getName()) {
                case "com.company.item.Sword":
                    ((Sword) (chosenWeapon)).hit();
                    break;
                case "com.company.item.Hammer":
                    ((Hammer) (chosenWeapon)).hit();
                    break;
                case "com.company.item.Boot":
                    ((Boot) (chosenWeapon)).hit();
                    break;
            }
        } else {
            System.out.println("Ei saanud pihta! Vaenlane võttis sult elu");
            Enemy.setHealth(Enemy.getHealth()-1);
        }
    }

    private static int enemyFightRandomNumber() {
        return (int) ((Math.random() * ((3 - 1) + 1)) + 1);
    }
}
