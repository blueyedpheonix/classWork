package animals;

public class Cat extends Animals {

	public Cat(String name, String color, int numberOfLegs) {
		super(name, color, numberOfLegs);
		canFly = false;
		
	}

	@Override
	public void sayMyName() {
		System.out.println("meow " + "my name is " + name);
		
	}

	@Override
	public void isFlyable() {
		System.out.println("can I fly? " + canFly);
	}

}
