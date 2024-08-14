package loops;

public class evensumwhile {

	public static void main(String[] args) {

		int i = 200;
		int sum = 0;

		while (i <= 500) {

			if (i % 2 == 0) {

				sum = sum + i;

			}
			i++;
			
		}
		System.out.println(sum);

	}
}
