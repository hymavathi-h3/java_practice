package arrays;

public class CpoyingTheElements {

	public static void main(String[] args) {

		int a[] = { 1, 2, 34, 56, 76 };
		int b[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			System.out.print(b[i]+" ");

		}
		System.out.println();
		for(int x:a) {
			System.out.print(x+" ");
		}
	}

}
