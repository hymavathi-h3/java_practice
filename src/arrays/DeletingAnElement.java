package arrays;

import java.util.Scanner;

public class DeletingAnElement {

	public static void main(String[] args) {

		int a[] = { 23, 45, 67, 65, 43 };
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the required delete index");
		int n = scr.nextInt();
		for (int x : a) {
			System.out.print(x+" ");
		}
		System.out.println();
		for (int i = n; i < a.length; i++) {
			a[i - 1] = a[i];
		}
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
