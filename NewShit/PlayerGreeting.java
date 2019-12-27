package NewShit;

import java.util.function.Function;

public class PlayerGreeting implements Function<String,String> {
    @Override
    public String apply(String name) {
        return "I am a player nice to meet you " + name;
    }
}
