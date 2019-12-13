package runners;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        legs = 4;
    }

    @Override
    public String getLegs() {
        return String.format("I have %d legs", legs);
    }
}
