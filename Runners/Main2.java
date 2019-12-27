package Runners;

import NewShit.*;

public class Main2 {
    public static void main(String[] args) {
        Player player = new Player();
        Zombie zombie = new Zombie();
        zombie.attack("dylan",5);
        player.attack("omer",7);
        System.out.println("is zombie alive?");
        zombie.printIsAlive(11);
        System.out.println("is player alive?");
        player.printIsAlive(34);
        zombie.printGreeting("Dylan");
        player.printGreeting("Omer");
        zombie.setGreet(new PlayerGreeting());
        zombie.printGreeting("Igor");
    }
}
