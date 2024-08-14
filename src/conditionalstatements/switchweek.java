package conditionalstatements;

import java.util.Scanner;

public class switchweek {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the day name");
		 String dayName=scr.next();
		 switch(dayName) {
		 case "monday":
		 case "tuesday":
		 case "wednesday":
		 case "thursday":
		 case "friday":
			 System.out.println("uff!! it's a weekday");
			 break;
		 case "saturday":
		 case "sunday":
			 System.out.println("yayyy!! it's a weekend");
			 break;
		default:
			System.err.println("Give the dayname correctly");
			break;
			
	
		 }
		scr.close();

	}

}
