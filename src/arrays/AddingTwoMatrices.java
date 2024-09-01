package arrays;

public class AddingTwoMatrices {

	public static void main(String[] args) {

		int a[][] = { { 12, 34 }, { 56, 76 } };
		int b[][] = { { 43, 54 }, { 21, 42 } };
		int c[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.printf("%03d ",c[i][j]);
//			}
//			System.out.println();
//		}
		for(int x[]:c) {
			
			for(int y:x) {
				
				System.out.printf("%03d ",y);
				
			}
			System.out.println();
			
		}

	}

}
