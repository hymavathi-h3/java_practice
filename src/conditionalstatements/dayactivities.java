package conditionalstatements;

import java.util.Scanner;

public class dayactivities {

	public static void main(String[] args) {

		
//		  Scanner scr = new Scanner(System.in);
//		  
//		  System.out.println("enter the day number");
		  
		  int day = java.time.LocalDate.now().getDayOfWeek().getValue();
		  
		  switch (day) {
		  
		  case 1: System.out.println("MOnday: GYM"); break; case 2:
		  System.out.println("TUeasy: yoga"); break; case 3:
		  System.out.println("wednesday: swimming"); break; case 4:
		  System.out.println("thursday: reading"); break; case 5:
		  System.out.println("friday: movies"); break; case 6:
		  System.out.println("saturday: hiking"); break; case 7:
		  System.out.println("sunday: rest"); break; default:
		  System.out.println("Invalid input"); }
		  
		  
		 

	}

}
