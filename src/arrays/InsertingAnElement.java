package arrays;

import java.util.Scanner;

public class InsertingAnElement {

	public static void main(String[] args) {

		int a[] = new int[10];
		a[0] = 10;
		a[1] = 12;
		a[2] = 21;
		a[3] = 11;
		a[4] = 22;
		a[5] = 80;
		a[6] = 34;
		a[7] = 32;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the index at which at you want to insert the value");
		int n = scr.nextInt();
		System.out.println("Enter the value which you want to insert");
		int number=scr.nextInt();
		int total_elements=8;
		for(int i=0;i<total_elements;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for (int i = total_elements; i > n; i--) {
			a[i] = a[i - 1];

		}
		a[n]=number;
		for(int i=0;i<total_elements+1;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
