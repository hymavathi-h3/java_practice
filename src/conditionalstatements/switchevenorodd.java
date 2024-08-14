package conditionalstatements;

import java.util.Scanner;

public class switchevenorodd {
	
	public static void main(String[] args) {
		
		Scanner scr= new Scanner(System.in);
		System.out.println("enter the number");
		 int num=scr.nextInt();
		 switch(num%2) {
		  
		 case 0:
			 System.out.println("it is even number");
			 break;
		 case 1:
			 System.out.println("it is odd number");
			 break;
		default:
			System.out.println("invalid input");
			break;
			 
		 }
		 scr.close();
	}
	
	
}
