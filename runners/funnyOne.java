package runners;

public class funnyOne implements Acting {
    @Override
    public void Comedy() {
        System.out.println("i am the funniest");
    }

    @Override
    public void Horror() {
        System.out.println("I am the scatiest");
    }

    @Override
    public void Drama() {
        System.out.println("I am a drama queen");
    }
}
