package Methods;

import java.util.Scanner;

public class MO_1 {
	
	static double area(int radius) {
		return Math.PI*radius*radius;
	}
	static int area(int length,int breadth) {
		return length*breadth;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		int r=6,s=9;
		double area=area(r,s);
		System.out.println(area);
		
		
	}

}
