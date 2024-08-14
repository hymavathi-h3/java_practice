package loops;

import java.util.Scanner;

public class triangleinreverse {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);

		int N = user.nextInt();

		for (int i = 1; i <= N; i++) {

			String msg = " ".repeat(N * 2 - (2 * i)) + "* ".repeat(i);

			System.out.println(msg);
		}
		user.close();

	}
}
