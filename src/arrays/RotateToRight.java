package arrays;

public class RotateToRight {

	public static void main(String[] args) {

		int a[] = { 89, 97, 65, 54, 43, 32, 8, 9, 10 };
		int temp = a[a.length - 1];
		for (int i =a.length-1; i >0 ; i--) {
			a[i] = a[i-1];
			
		}
		
		a[0]=temp;
		for(int x:a) {
			System.out.print(x+" ");
		}

	}

}
