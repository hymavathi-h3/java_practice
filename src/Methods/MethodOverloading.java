package methods;

import java.util.Scanner;

public class MethodOverloading {
	
	static int max(int x,int y) {
		return x>y?x:y;
	}
	
	static float max(float x,float y) {
		return x>y?x:y;
	}
	static int max(int x,int y,int z) {
		return (x>y && x>z)?x:((y>z)?y:z);
	}
	
	
	
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int a=10,b=90,c=900;
		int d=max(a,b,c);
		System.out.println(d);
		
	}

}
