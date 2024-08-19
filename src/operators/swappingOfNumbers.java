package operators;

import java.util.Scanner;

public class swappingOfNumbers {
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		int a=scr.nextInt();
		int b=scr.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping a is:"+a);
		System.out.println("After swapping b is:"+b);
		
		
	}

}
