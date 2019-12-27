package NewShit;

import java.util.function.Consumer;

public class HumanAttack implements Consumer<String> {
    @Override
    public void accept(String name) {
        System.out.printf("my name is %s I come in peace\n",name);
    }
}
