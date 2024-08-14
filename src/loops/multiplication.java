package loops;

import java.util.Scanner;

public class multiplication {
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number of required table");
		int num=scr.nextInt();
		System.out.println("Enter the required number of multiples");
		int j=scr.nextInt();
		int result=1;
		for(int i=1;i<=j;i++) {
			
			result=num*i;
			System.out.println(num +" x "+i+" = "+result);
			
			
		}
		
	}

}
