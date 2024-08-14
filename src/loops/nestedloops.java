package loops;

public class nestedloops {

	public static void main(String[] args) {

		/*
		 * for(int i=0;i<=5;i++) {
		 * 
		 * for(int j=0;j<=3;j++) {
		 * 
		 * if(i !=j) { continue;
		 * 
		 * } System.out.println(i+" "+j);
		 * 
		 * } }
		 */

		outer: for (int i = 0; i <= 5; i++) {         //here we are using labels for using the break and continue statements

			inner: for (int j = 0; j <= 3; j++) {

				if (i == j) {
					break inner;

				}
				System.out.println(i + " " + j);

			}
		}
	}

}
