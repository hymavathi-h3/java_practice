package arrays;

public class SecondLargestElement {
	
	public static void main(String[] args) {
		
		int a[]= {25,7,76,54,90};
		int max1=a[0];
		int max2=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}else {
				if(a[i]>max2) {
					max2=a[i];
				}
			}
			
		}
		System.out.println("Second largest element in the array is "+max2);
	}
	

}
