package runners;

public class Main2 {
    public static void main(String[] args) {
        Dog dog = new Dog("lala");
        Cat cat = new Cat("blulbu");
        Dolfin dolfin = new Dolfin("blipblip");
        Animal[] zoo = {dog,cat,dolfin};
        for (Animal animal: zoo){
            System.out.println(animal.getLegs());
        }
    }
}
