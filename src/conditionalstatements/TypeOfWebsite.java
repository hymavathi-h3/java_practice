package conditionalstatements;

import java.util.Scanner;

public class TypeOfWebsite {
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the website name");
		String str=scr.nextLine();
		String domain=str.substring(str.lastIndexOf(".")+1);
		switch(domain) {
		case "com":
			System.out.println("Commercial");
			break;
		case "gov":
			System.out.println("Government");
			break;
		case "net":
			System.out.println("Network");
			break;
		default:
			System.out.println("Invalid domain");
			break;
		}
		
	}

}
