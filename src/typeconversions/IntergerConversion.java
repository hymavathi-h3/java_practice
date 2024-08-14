package typeconversions;

import java.util.Scanner;

public class IntergerConversion {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int num1=16;
		float num2=34f;
		long num3=456;
		
		int x=(int)num2;
		int y=(int)num3;
		
		System.out.print(x);
		System.out.println(y);
		
		
        String word=input.next();
        System.out.println("Hello "+word);
        
        

		
	}

}
