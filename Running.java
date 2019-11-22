import person.Person;

public class Running {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person(25);
		Person p3 = new Person("jake",12);
		Person p4 = new Person("avi",16,"batyam");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
	
	}

}
