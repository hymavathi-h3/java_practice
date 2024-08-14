package operators;

import java.util.Scanner;

public class ternaryoperator{
	public static void main(String[] args) {
	
		//condition ? expression1 : expression2;
		
	//Scanner input = new Scanner(System.in);
//		System.out.println("Enter the token ");
//        int token = input.nextInt();
//        String message = (token == 20) ? "Collect Water Bottle" : "Invalid Token" ;
//        System.out.println(message);
//        
//        
//        
//        System.out.println("Enter num1 ");
//        int num1 = input.nextInt();
//        System.out.println("Enter num2");
//        int num2 = input.nextInt();
//        int largest = num1 > num2 ? num1 : num2 ;
//        System.out.println(largest);
//        
//        
//        
//        System.out.println("Enter a");
//        int a = input.nextInt();
//        System.out.println("Enter b");
//        int b = input.nextInt();
//        System.out.println("Enter c");
//        int c = input.nextInt();
//        int largest1 = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);
//        System.out.println(largest1 + " is the largest among "+ a + ", " + b + ", and " + c);
//        
//        int num=input.nextInt();
//        int first_digit=num%10;
//        System.out.println(first_digit);
//        num=num/10;
//        System.out.println(num);
//        int second_digit=num%10;
		Scanner scr =new Scanner(System.in);
        int num=scr.nextInt();
        int first_digit=num%10;
        int num1=num/10;
        int second_digit=num1%10;
        if(first_digit+second_digit==7 ){
            System.out.println("Special Number");
        }
        else if(first_digit==7 ||second_digit==7){
            System.out.println("Special Number");
        }
        else if(num%7==0){
            System.out.println("Special Number");
        }
        else{
            System.out.println("Normal Number");
        }
        
        
		
        
        	
	}

}