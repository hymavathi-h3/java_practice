package variables;

import java.util.Scanner;

public class DecimalToRemainingFormats {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the decimal number");

		int decimal = scr.nextInt();
		String binary = Integer.toBinaryString(decimal);
		String octal = Integer.toOctalString(decimal);
		String hexaDecimal = Integer.toHexString(decimal);

		System.out.println("Decimal number:" + decimal);
		System.out.println("decimal number in binary format is: " + binary);
		System.out.println("decimal number in octal format is: " + octal);
		System.out.println("decimal number in octal format is: " + hexaDecimal);

	}

}
