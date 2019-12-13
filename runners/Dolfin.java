package runners;

public class Dolfin extends Animal {
    public Dolfin(String name) {
        super(name);
        legs = 0;
    }

    @Override
    public String getLegs() {
        return String.format("I have %d legs", legs);
    }

}
