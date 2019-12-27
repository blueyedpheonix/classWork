package NewShit;

public class Player extends Entity {
    public Player() {
        attackStragety = new PlayerAttack();
        greet = new PlayerGreeting();
    }

    @Override
    public void attack(String name,Integer health) {
        System.out.println("Player: ");
        attackStragety.accept(name,health);
    }

    @Override
    public void printGreeting(String name) {
        System.out.println(greet.apply(name));
    }

}
