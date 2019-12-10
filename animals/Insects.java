package animals;

public abstract class Insects extends Animals implements flyAble  {
	public Insects(String name, boolean canFly) {
		super(name);
		this.canFly = canFly;
	}
	@Override
	public void canFly() {
		System.out.println("fuck you ");
		
	}

	



}
