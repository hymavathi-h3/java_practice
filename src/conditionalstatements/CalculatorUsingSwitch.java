package conditionalstatements;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter a");

		int a = scr.nextInt();

		System.out.println("Enter b");

		int b = scr.nextInt();

		System.out.println("Enter option using words");
		
		scr.nextLine();

		String option = scr.nextLine();

		switch(option) {
		case "Add":
			System.out.println(a + b);
			break;

		case "Subract":
			System.out.println(a - b);
			break;
		case "Multiply":
			System.out.println(a * b);
			break;
		case "Divide":
			System.out.println(a / b);
			break;
		default:
			System.out.println("Invalid Option");
			break;
		}
	}

}
