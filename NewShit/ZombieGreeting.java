package NewShit;

import java.util.function.Function;

public class ZombieGreeting implements Function<String,String> {
    @Override
    public String apply(String name) {
        return "I am a zombie, nice to meet you "+ name;
    }
}
