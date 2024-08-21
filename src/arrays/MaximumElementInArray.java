package arrays;

public class MaximumElementInArray {
	
	public static void main(String[] args) {
		
		int a[]= {42,87,9,76,89};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>a[0]) {
				max=a[i];
			}
		}
		System.out.println("Maximum element in the array is "+max);
	}

}
