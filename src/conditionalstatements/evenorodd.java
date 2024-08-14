package conditionalstatements;

import java.util.Scanner;

public class evenorodd {
	
	public static void main(String[] args) {
		
		Scanner scr= new Scanner(System.in);
		System.out.println("enter number");
		int num=scr.nextInt();
		if(num%2==0) {
			System.out.println("It's a even number");
		}else {
			System.out.println("It's a odd number");
		}
		
	}

}
