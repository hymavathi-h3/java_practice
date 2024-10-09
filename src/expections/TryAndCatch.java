package expections;

import java.util.Scanner;

public class TryAndCatch {
	
	public static void main(String[] args) {
//		
//		int a[]= {12,34,0,76};
//		int b;
//		try {
//			
//			b=a[1]/a[2];
//			System.out.println(b);
//			System.out.println(a[100]);
//			
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		
		
		int a,b;
		float c;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		a=scr.nextInt();
		b=scr.nextInt();
		try {
			c=a/(float)b;
			System.out.println(c);
			
		}
		catch(Exception e) {
			System.out.println("Enter the  values of a and b properly!..avoid zeros");
		}
		scr.close();
	}

}
