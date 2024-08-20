package conditionalstatements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter the year");

		int y = scr.nextInt();
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			System.out.println("It's a leap year");
		} else {
			System.out.println("It's not a leap year");
		}

	}

}
