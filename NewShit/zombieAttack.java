package NewShit;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class zombieAttack implements BiConsumer<String,Integer> {

    @Override
    public void accept(String name,Integer health) {
        System.out.printf("ill Chew you up %s \n",name);
        System.out.printf("%d the amount of health is will cost you\n",health);
    }
}
