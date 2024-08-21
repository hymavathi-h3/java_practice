package arrays;

public class OneDimensionalArray {
	
	public static void main(String[] args) {
		
		int A[]= {21,67,87,56,43};
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
		System.out.println("The length of an array is "+A.length);
		for(int x:A) {
			System.out.print(x+" ");
		}
		
	}

}
