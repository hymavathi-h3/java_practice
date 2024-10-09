package methods;

public class MO_2 {

	static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		return rev;

	}

	static void reverse(int a[]) {

		int b[] = new int[a.length];
		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			b[j] = a[i];
			System.out.print(b[j] + " ");
		}

	}

	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 89 };

//		int num=567;
		reverse(a);
//		System.out.println(reversed);

	}

}
