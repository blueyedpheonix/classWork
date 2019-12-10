package animals;

public class Dog extends Animals {

	
	public Dog(String name, String color, int numberOfLegs) {
		super(name, color, numberOfLegs);
		canFly = false;
	}

	@Override
	public void sayMyName() {
		System.out.println("wooof" + "my name is " + name);
		
	}
	
	@Override
	public void isFlyable() {
		 System.out.println("can I fly? " + canFly);
	}
	
	
	

}
