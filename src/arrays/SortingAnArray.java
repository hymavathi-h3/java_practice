package arrays;


public class SortingAnArray {
	
	public static void main(String[] args) {
		
		String str[]= {"Hyma","Apple","Sridevi","Lakshmi","Balu","Bhargav"};
		
		java.util.Arrays.sort(str);
		
		for(String x:str) {
			System.out.println(x);
		}
		
	}

}
