package loops;

import java.util.Scanner;

public class PrimeOrNot {
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scanner.nextInt();

		
//		int factorsCount = 0;
//		int i = 1;
//		while (n>=i) {
//			if (n % i == 0) {
//				factorsCount++;
//
//			}
//			i++;
//
//		}
//		if (factorsCount == 2) {
//			System.out.println("It is prime number");
//		} else {
//			System.out.println("It is not a prime number");
//		}
		boolean isPrime=isPrime(n);
		if(isPrime) {
			System.out.println(n+" is a prime number");
			System.out.println(n);
			
		}else {
			System.out.println(n+" is not a prime number");
		}
		
	}
	public static boolean isPrime(int n) {      //this method is the efficient method
		
		
		if(n<=1) {
			
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
		
	}
}
