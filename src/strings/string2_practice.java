package strings;

import java.util.Scanner;

public class string2_practice {
	
	public static void main(String[] args) {
		
//		int binary=101010;
//		
//		String str=String.valueOf(binary);
//		
//		System.out.println(str.matches("[01]+"));
//		
//		String hexaDecimal="1345ABED";
//		
//		System.out.println(hexaDecimal.matches("[A-F0-9]+"));
//		
//		String date="20/54/2003";
//		
//		System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
//		
//		String str1="234 7897 890 ashdxguyd jhi";
//		str1=str1.replaceAll("\\s", " ").trim();
//		String words[]=str1.split("\\d");
//		System.out.println(words.length);
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a number");
		
		String str2=scr.nextLine();
		
		if(str2.matches("[01]*")) {
			System.out.println("Binary");
		}else if(str2.matches("[0-7]*")){
			System.out.println("Octal");
		}else if(str2.matches("[A-F0-9]+")) {
			System.out.println("Hexa decimal");
		}
		
		
		
	}

	
}
