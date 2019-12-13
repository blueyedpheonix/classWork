package runners;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        legs = 3;
    }

    @Override
    public String getLegs() {
        return String.format("I have %d legs", legs);
    }

}
