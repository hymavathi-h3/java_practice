package arrays;

public class MultiplicationOfMatrices {

	public static void main(String[] args) {

		int a[][] = { { 12, 34 }, { 56, 76 } };
		int b[][] = { { 1, 0 }, { 0, 1 } };
		int c[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 2; k++) {

					c[i][j] += a[i][k] * b[k][j];
				}

			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
