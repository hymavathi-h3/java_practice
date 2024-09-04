package loops;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the maxlimit");
		int maxLimit=scanner.nextInt();
		for(int n=1;n<=maxLimit;n++) {
			boolean isPrime=isPrime(n);
			if(isPrime)
				System.out.println(n);
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
