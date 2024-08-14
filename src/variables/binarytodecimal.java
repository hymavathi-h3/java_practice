package variables;

import java.util.Scanner;

public class binarytodecimal {
	
public static void main(String[] args) {
	
	Scanner scr = new Scanner(System.in);
	System.out.println("Enter the binary number");

	String binary = scr.next();
	
	int decimal=Integer.parseInt(binary,2);
	System.out.println(binary+" in decimal format is "+decimal);
	
}

}
