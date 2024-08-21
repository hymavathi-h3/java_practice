package arrays;

public class IncresingSizeOfArray {
	
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 34, 56, 76 };
		int b[] = new int[2*(a.length)];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];

		}
		a=b;
		b=null;
		System.out.println();
		for(int x:a) {
			System.out.print(x+" ");
		}
	}

}
