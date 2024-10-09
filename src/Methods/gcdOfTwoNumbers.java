package methods;

import java.util.Scanner;

public class gcdOfTwoNumbers {
	
	static int gcd(int m,int n) {
		
		while(m!=n) {
			if(m>n)
				m=m-n;
			else if(m<n)
				n=n-m;
		}
		return m;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int m=scr.nextInt();
		int n=scr.nextInt();
		int gcd=gcd(m,n);
		System.out.println("GCD of 2 numbers is "+gcd);
	}

}
