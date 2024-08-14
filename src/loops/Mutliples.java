package loops;

import java.util.Scanner;

public class Mutliples {
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scr.nextInt();
		int i=1;
		int result=1;
		while(i<=10) {
			result=n*i;
			System.out.println(n+"*"+i+"="+result);
			i++;
		}

	}

}
