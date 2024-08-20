package loops;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		int a=0;
		int b=1;
		System.out.println("Enter n");
		int n=scr.nextInt();
		System.out.print(a+" "+b+" ");
		int c;
		for(int i=1;i<=n-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
			
			
			
		}
	}

}
