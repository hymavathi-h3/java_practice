package Methods;

import java.util.Scanner;

public class IsPrime {
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scr.nextInt();
		boolean b=isprime(num);
		if(b) {
			System.out.println(num+" is a prime number");
		}else
			System.out.println(num+" is not a prime number");
		
		
	}
	static boolean isprime(int num) {
		int factors=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				factors++;
			}
		}
		if(factors>0) {
			return false;
		}
		return true;
		
	}

}
