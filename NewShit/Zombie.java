package NewShit;

public class Zombie extends Entity {
    public Zombie() {
        attackStragety = new zombieAttack();
        greet = new ZombieGreeting();
    }

    @Override
    public void attack(String name,Integer health) {
        System.out.println("zombie: ");
        attackStragety.accept(name,health);
    }

    @Override
    public void printGreeting(String name) {
        System.out.println(greet.apply(name));
    }


}
