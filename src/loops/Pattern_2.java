package loops;

public class Pattern_2 {
	
	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%02d ",(count++));
			}
			System.out.println();
		}

	}
}
