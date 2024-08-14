package conditionalstatements;

import java.util.Scanner;

public class gradingsystem {
	
	public static void main(String[] args) {
		
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=scr.nextInt();
		if(marks>=35 & marks<=100 ) {
			if(marks==35)
			System.out.println("you are passed");
			else if(marks>35 & marks<=70) {
				System.out.println("you are passed in third class");
			}
			else if(marks>70 & marks<=85) {
				System.out.println("you are passed in second class");
			}
			else if(marks>85 & marks<=100) {
				System.out.println("you are passed in first class");
			}
		}
		else {
			System.out.println("you are failed");
		}
		
	}
	

}
