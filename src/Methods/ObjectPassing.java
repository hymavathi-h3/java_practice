package methods;

import java.util.Scanner;

public class ObjectPassing {
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		int a[]= {12,78,45,67,90};
		System.out.println("Enter index and updated value");
		update(a,scr.nextInt(),scr.nextInt());
		for(int x:a) {
			System.out.print(x+" ");
		}
		
	}
	static void update(int x[],int index,int value) {
		x[index]=value;
	}
}
