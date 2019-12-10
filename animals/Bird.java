package animals;

public class Bird extends Animals {

	public Bird(String name, String color, int numberOfLegs) {
		super(name, color, numberOfLegs);
		canFly = true;
	}
	@Override
	public void sayMyName() {
		System.out.println("chirp " + "my name is " + name);
		
	}
	@Override
	public void isFlyable() {
		System.out.println("can I fly? " + canFly);
	}

	

}
