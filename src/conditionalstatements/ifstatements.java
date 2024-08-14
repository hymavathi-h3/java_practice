package conditionalstatements;

import java.util.Scanner;

public class ifstatements {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter your age");
		int age=scr.nextInt();
		if(age>=18) {
			System.out.println("you are a major");
		}else {
			System.out.println("you are a minor");
		}
	}

}
