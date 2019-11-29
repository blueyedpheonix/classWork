package calculator;
import static calculator.Clac.*;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean running = true;
		System.out.println("Start");
		double answer;
		double num1 = input.nextDouble();
		char function = input.next().charAt(0);
		do {double num2 = input.nextDouble();
			num1 = Clac.check(function, num1, num2);
			System.out.println(num1);
			function = input.next().charAt(0);
		}while(function != '=');
		System.out.println(num1);
	}

}
