package arrays;

public class TwoDimensionalArrays {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3, 4 }, { 3, 6, 7, 88 }, { 54, 87, 65, 43 } };
//
//		for (int i = 0; i < a.length; i++) {
//
//			for (int j = 0; j < a[0].length; j++) {
//
//				System.out.print(a[i][j]+" ");
//			}
//		}
		
		for(int x[]:a) {
			
			for(int y:x) {
				
				System.out.printf("%02d ",y);
			}
			System.out.println();
		}

	}

}
