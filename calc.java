import java.util.Scanner;

import mathOperators.Times;

public class calc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Pleas enter numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		Times time = new Times();
		System.out.println(time.kefel(num1, num2));
		System.out.println(time.minus(num1, num2));
		System.out.println(time.plus(num1, num2));
		System.out.println(time.hiluk(num1, num2));
		
	}

}
