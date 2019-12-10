package animals;

public class Dolfin extends Mamle implements flyAble,lengthOfPregnenthy {

	public Dolfin(String name, boolean canFly) {
		super(name, canFly);
	}

	@Override
	public void theLengthOfPregnothy() {
		System.out.println("11 month");
	}

	@Override
	public void canFly() {
		System.out.println("i can in the warter");
	}
	
	
}
