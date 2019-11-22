package person;

public class Person {
	String name;
	int age;
	String address;
	
	public Person(String name, int age,  String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Person(String name, int age)
	{
		this(name, age,"telAviv");      
	}
	public Person(int age)
	{
		this("omer",age,"granados");
	}
	public Person()
	{
		this("Dylan",23, "USA");
	}
	
	@Override
	  public String toString()
	  {
		return String.format("your name: %s\nyour age: %d\nyour address: %s\n", name,age,address);
	  }
	  

}
