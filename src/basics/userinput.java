package basics;

import java.util.Scanner;

public class userinput {
	
	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		System.out.println("enter your name");
		String name=scr.next();
		System.out.println("enter your age");
		int age=scr.nextInt();
		System.out.println("hey "+ name+"!!!!"+" your age is "+ age);
		System.out.println("enter your age in decimals");
		Double ages=scr.nextDouble();
		System.out.println(ages);
		
		
	}
	
	
	
	

}
