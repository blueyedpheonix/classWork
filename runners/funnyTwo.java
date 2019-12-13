package runners;

public class funnyTwo implements Acting {
    @Override
    public void Comedy() {
        System.out.println("i am not funny");
    }

    @Override
    public void Horror() {
        System.out.println("I am not scary");
    }

    @Override
    public void Drama() {
        System.out.println("I am not a drama queen");
    }
}
