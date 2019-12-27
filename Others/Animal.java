package Others;

public abstract class Animal {

    protected Flyability flyability;

    public Animal(){}

    public void doesItFly(){
        flyability.isFlyable();
    }

    public void setFlyability(Flyability flyability) {
        this.flyability = flyability;
    }
}
