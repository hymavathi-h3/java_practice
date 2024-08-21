package arrays;

public class ReverseCopying {

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 34, 56, 76 };
		int b[] = new int[5];
		for (int i = a.length-1; i >=0; i--) {
			b[i] = a[i];
			System.out.printf("%02d ",b[i]);

		}
		System.out.println();
		for(int x:a) {
			System.out.printf("%02d ",x);
		}
	}

}
