package NewShit;

import java.util.function.Predicate;

public class Alive implements Predicate<Integer> {

    @Override
    public boolean test(Integer Hp) {
       return Hp > 30;
    }
}
