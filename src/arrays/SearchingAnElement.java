package arrays;

public class SearchingAnElement {
	
	public static void main(String[] args) {
		
		int a[]= {45,78,90,76,43};
		int key=43;
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				System.out.println("Element found at index "+i);
			}
		}
	}

}
