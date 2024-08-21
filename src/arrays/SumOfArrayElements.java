package arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {

		int a[] = { 21, 76, 86, 43, 90 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}

}
