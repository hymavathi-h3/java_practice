package loops;

import java.util.Scanner;

public class ReverseOfNumber {
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		int num=scr.nextInt();
		
		int digit;
		
		while(num>0) {
			
			digit=num%10;
			num=num/10;
			System.out.print(digit);
		}
	}

}
