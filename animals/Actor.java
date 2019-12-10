package animals;

public class Actor implements Acting {
	private String name;
	private String howGood;
	private int age;

	public Actor(String name, String howGood, int age) {
		super();
		this.name = name;
		this.howGood = howGood;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getHowGood() {
		return howGood;
	}

	public void setHowGood(String howGood) {
		this.howGood = howGood;
	}

	public int getAge() {
		return age;
	}

	@Override
	public void actingWithDrama() {
		System.out.println("I am a drama queen");
	}

	@Override
	public void actingWithHumor() {
		System.out.println("I am a comdien");
	}

	@Override
	public void actingWithHorror() {
		System.out.println("who wants to be scared?");
	}

}
