package arrays;

public class RotationOfElements {
	
	public static void main(String[] args) {
		
		int a[]= {23,78,90,65,54,43,34};
		int temp=a[0];
		int n=a.length;
		for(int i=1;i<a.length;i++) {
			a[i-1]=a[i];
			System.out.print(a[i-1]+" ");
			
		}
		
		a[n-1]=temp;
		System.out.println(temp);
		
	}

}
