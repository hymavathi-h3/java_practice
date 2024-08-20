package loops;

import java.util.Scanner;

public class DigitsOfaNumber {
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		
		int num=scr.nextInt();
		
		int digit;
		
		while(num>0) {
			
			digit=num%10;
			
			num/=10;
			
			System.out.println(digit);
			
		}
	}

}
