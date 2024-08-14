package loops;

import java.util.Scanner;

public class ReverseAString {
	
	public static void main (String[] args) {
        Scanner scr=new Scanner(System.in);
        String str=scr.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            System.out.print(ch);
        }
    }

}
