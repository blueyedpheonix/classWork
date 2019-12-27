package NewShit;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class PlayerAttack implements BiConsumer<String,Integer> {

    @Override
    public void accept(String name,Integer health) {
        System.out.printf("my sword will slash you up %s",name);
        System.out.printf("%d the amount of health is will cost you\n",health);
    }
}
