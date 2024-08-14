package conditionalstatements;

import java.util.Scanner;

public class operations {

	public static void main(String[] args) {
		
		Scanner scr= new Scanner(System.in);
		System.out.println("enter the 1st number");
		int num1=scr.nextInt();
		System.out.println("enter the 2nd number");
		
		int num2=scr.nextInt();		
        System.out.println("Enter the operation");
        String operation=scr.next();
		
		switch(operation) {
		case "+":
			int add=num1+num2;
			System.out.printf("addition of two numbers is "+add);
			
			break;
		case "-":
			int sub=num1-num2;
			System.out.printf("subraction of two numbers is "+sub);
			break;
		case "*":
			int mul=num1*num2;
			System.out.printf("multiplication of two numbers is "+mul);
			break;
		case "/":
			float div=num1/num2;
			System.out.printf("division of two numbers is "+div);
			break;
		case "%":
			int mod=num1%num2;
			System.out.printf("modulus of two numbers is "+ mod);
			break;	
		default:
			System.out.println("invalid input");
			break;
		
			
			
		
		}
		
    scr.close();
	}

}
