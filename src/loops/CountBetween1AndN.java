package loops;


import java.util.Scanner;

public class CountBetween1AndN {
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		
		int n=scr.nextInt();
		
		int count=0;
		
		for(int i=1;i<=n;n++) {
			
			count+=String.valueOf(i).length();
		}
		System.out.println(count);
	}

}
