package NewShit;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class Entity {
    protected BiConsumer<String,Integer> attackStragety;
    protected Predicate<Integer> isAlive = new Alive();
    protected Function<String,String> greet;

    public Entity(){}

    public abstract void attack(String name,Integer health);

    public abstract void printGreeting(String name);


    public void setGreet(Function<String, String> greet) {
        this.greet = greet;
    }

    public void printIsAlive(int Hp){
        System.out.println(isAlive.test(Hp));
    }

    public void setAttackStragety(BiConsumer<String,Integer> attackStragety) {
        this.attackStragety = attackStragety;
    }
}
