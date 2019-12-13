package runners;

public abstract class Animal {
    private String name;
    protected int legs;
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String getLegs();
}
