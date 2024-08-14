package loops;

import java.util.Scanner;

public class powerOfANumber {
	public static void main (String[] args) {
        Scanner scr=new Scanner(System.in);
        int m=scr.nextInt();
        int n=scr.nextInt();
        long mul=1;
        for(int i=1;i<=n;i++){
            mul=mul*m;
        }
        System.out.println(mul);
    }

}
