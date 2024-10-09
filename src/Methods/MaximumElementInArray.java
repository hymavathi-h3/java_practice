package methods;

public class MaximumElementInArray {
	
	public static void main(String[] args) {
		int a[]= {5609,89,689,32,90};
		int max=max(a);
		System.out.println("Maximum Elment In Array is "+max);
	}
	static int max(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}

}
