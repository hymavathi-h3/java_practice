package loops;

import java.util.Scanner;

public class ArithematicProgression {
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a");
		int a=scr.nextInt();
		System.out.println("Enter n");
		int n=scr.nextInt();
		System.out.println("Enter d");
		int d=scr.nextInt();
		int term=a;
		for(int i=1;i<=n;i++) {
			
			System.out.print(term+", ");
			term+=d;
		}
	}

}
