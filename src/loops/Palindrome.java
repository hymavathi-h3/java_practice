package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scr.nextInt();
		int m=num;
		int digit;
		int reverse = 0;
		while (num > 0) {
			digit = num % 10;
			reverse = (reverse) * 10 + digit;
			num /= 10;

		}
		if(reverse==m) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
