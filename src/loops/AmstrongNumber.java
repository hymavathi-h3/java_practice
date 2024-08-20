package loops;

import java.util.Scanner;

public class AmstrongNumber {
	
	public static void main(String[] args) {
		
		
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num=scr.nextInt();
		
		int num1=num;
		
		long r;
		long sum=0;
		
		while(num1>0) {
			
			r=num1%10;
			num1/=10;
			sum+=(r*r*r*r);
			
		}
		if(num==sum) {
			System.out.println("Amstrong Number");
		}else {
			System.out.println("Not a Amstrong Number");
		}
	}

}
